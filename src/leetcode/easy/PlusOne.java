package leetcode.easy;

import java.util.Arrays;

/**
 * You are given a large integer represented as an integer array digits,
 * where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * <p>
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * <p>
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * <p>
 * Constraints:
 * <p>
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */
public class PlusOne {

    public int[] plusOneFromLeetCode(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;

    }

    public int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1]++;
            return digits;
        }

        if (digits.length == 1) {
            return new int[]{1, 0};
        }

        boolean passToNext = false;
        boolean checkToNine = true;

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] == 9 && checkToNine) {
                digits[i] = 0;
                passToNext = true;
            } else {

                if (passToNext) {
                    digits[i]++;

                    if (digits[i] > 9) {
                        digits[i] = 0;
                    } else {
                        passToNext = false;
                        checkToNine = false;
                    }

                }

            }

        }

        if (passToNext) {

            int[] result = new int[digits.length + 1];
            result[0] = 1;

            int k = 1;

            for (int digit : digits) {
                result[k] = digit;
                k++;
            }

            return result;

        }

        return digits;

    }

    public static void main(String[] args) {

        int[] digits0 = {1, 2, 3};
        int[] digits1 = {4, 3, 2, 1};
        int[] digits2 = {9};
        int[] digits3 = {9, 9};
        int[] digits4 = {9, 8, 9};
        int[] digits5 = {8, 9, 9, 9};

        PlusOne plusOne = new PlusOne();

        System.out.println(Arrays.toString(plusOne.plusOne(digits0)));
        System.out.println(Arrays.toString(plusOne.plusOne(digits1)));
        System.out.println(Arrays.toString(plusOne.plusOne(digits2)));
        System.out.println(Arrays.toString(plusOne.plusOne(digits3))); //expect 1, 0, 0
        System.out.println(Arrays.toString(plusOne.plusOneFromLeetCode(digits4))); //expect 9, 9, 0
        System.out.println(Arrays.toString(plusOne.plusOne(digits5))); //expect 9,0,0,0

    }

}
