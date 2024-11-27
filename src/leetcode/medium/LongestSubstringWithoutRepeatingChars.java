package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingChars {

    public static int lengthOfLongestSubstring__BadPerformanceForLongStr(String s) {

        if (s == null || s.isEmpty()) return 0;

        if (s.length() == 1) {
            return 1;
        }

        if (isUnique(s)) {
            return s.length();
        }

        int max0 = lengthOfLongestSubstring__BadPerformanceForLongStr(s.substring(0, s.length() - 1));

        int max1 = lengthOfLongestSubstring__BadPerformanceForLongStr(s.substring(1));

        return Math.max(max0, max1);

    }

    public static boolean isUnique(String s) {

        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }

        return true;

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) return 0;

        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);

        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "ohomm";
        String s5 = "biidygcc";
        String s6 = "kmzmtyyfgqzzrsadztlfuhfmo";

        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring(s4));
        System.out.println(lengthOfLongestSubstring(s5));
        System.out.println(lengthOfLongestSubstring(s6));

    }

}
