package leetcode.medium;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed.
 * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
 * then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * Input: x = 123
 * Output: 321
 * <p>
 * Input: x = -123
 * Output: -321
 * <p>
 * Input: x = 120
 * Output: 21
 */
public class ReverseInteger {

    public int reverse(int x) {

        long res = 0;

        while (x != 0) {

            if ((res * 10) >= Integer.MAX_VALUE || ((res * 10) <= Integer.MIN_VALUE)) {
                return 0;
            }

            res = (res * 10) + (x % 10);

            x = x / 10;

        }

        return Math.toIntExact(res);

    }

    public static void main(String[] args) {

        ReverseInteger reverseInteger = new ReverseInteger();

        System.out.println(reverseInteger.reverse(123));
        System.out.println(reverseInteger.reverse(-123));
        System.out.println(reverseInteger.reverse(120));
        System.out.println(reverseInteger.reverse(1534236469));

    }

}
