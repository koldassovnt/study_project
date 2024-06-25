package leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * <p>
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * <p>
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 * <p>
 * <p>
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        List<Integer> numsOfX = new ArrayList<>();

        if (x < 0) {
            return false;
        }

        while (x != 0) {
            Integer remains = x % 10;

            numsOfX.add(remains);

            x = x / 10;
        }

        if (!numsOfX.isEmpty()) {
            for (int i = 0, j = numsOfX.size() - 1;
                 i < numsOfX.size() && j >= 0;
                 i++, j--) {
                if (Objects.equals(numsOfX.get(i), numsOfX.get(j))) {
                    continue;
                }
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        int test1 = 121;
        int test2 = -121;
        int test3 = 10;
        int test4 = 11;

        System.out.println(isPalindrome(test1));
        System.out.println(isPalindrome(test2));
        System.out.println(isPalindrome(test3));
        System.out.println(isPalindrome(test4));

    }

}
