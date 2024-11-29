package leetcode.easy;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * <p>
 * Input: s = "()"
 * Output: true
 * <p>
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Input: s = "(]"
 * Output: false
 * <p>
 * Input: s = "([])"
 * Output: true
 */
public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char symbol : s.toCharArray()) {

            switch (symbol) {
                case '(', '{', '[' -> {
                    stack.push(symbol);
                    continue;
                }
            }

            if (stack.isEmpty()) return false;

            if (')' == symbol && '(' != stack.pop()) {
                return false;
            }

            if ('}' == symbol && '{' != stack.pop()) {
                return false;
            }

            if (']' == symbol && '[' != stack.pop()) {
                return false;
            }

        }

        return stack.empty();

    }

    public static void main(String[] args) {

        ValidParentheses validParentheses = new ValidParentheses();

        System.out.println(validParentheses.isValid("()"));
        System.out.println(validParentheses.isValid("()[]{}"));
        System.out.println(validParentheses.isValid("(]"));
        System.out.println(validParentheses.isValid("([])"));
        System.out.println(validParentheses.isValid("([)]"));
        System.out.println(validParentheses.isValid("("));

    }

}