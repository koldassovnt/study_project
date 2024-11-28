package leetcode.easy;

import java.util.Map;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * <p>
 * For example, 2 is written as II in Roman numeral, just two ones added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * <p>
 * There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * <p>
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * <p>
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class RomanToInteger {

    public int romanToInt(String s) {

        Map<String, Integer> romanToArabicMap = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );

        String[] eachRomanNumber = s.split("");

        int result = 0;

        String lastNum = "";

        for (String current : eachRomanNumber) {

            Integer arabicNum = romanToArabicMap.get(current);

            result += arabicNum;//1100 + 1000 = 2100

            if ("I".equals(lastNum)) {
                if ("V".equals(current)) {
                    result -= (romanToArabicMap.get("I") * 2);
                } else if ("X".equals(current)) {
                    result -= (romanToArabicMap.get("I") * 2);
                }
            }

            if ("X".equals(lastNum)) {
                if ("L".equals(current)) {
                    result -= (romanToArabicMap.get("X") * 2);
                } else if ("C".equals(current)) {
                    result -= (romanToArabicMap.get("X") * 2);
                }
            }

            if ("C".equals(lastNum)) {
                if ("D".equals(current)) {
                    result -= (romanToArabicMap.get("C") * 2);
                } else if ("M".equals(current)) {
                    result -= (romanToArabicMap.get("C") * 2);
                }
            }

            lastNum = current;

        }

        return result;

    }

    public static void main(String[] args) {

        RomanToInteger romanToInteger = new RomanToInteger();

        System.out.println(romanToInteger.romanToInt("III"));
        System.out.println(romanToInteger.romanToInt("LVIII"));
        System.out.println(romanToInteger.romanToInt("MCMXCIV"));

    }

}
