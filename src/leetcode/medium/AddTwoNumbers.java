package leetcode.medium;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <p>
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * <p>
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 * 9 + 9
 * 18 -> passToNext 1
 * 9 + 9 -> 18 + 1 from above = 19 -> passToNext = 1
 * 9 + 9 -> 18 + 1 from above = 19 -> passToNext = 1
 * 9 + 9 -> 18 + 1 from above = 19 -> passToNext = 1
 * 9 + 0 -> 9 + 1 from above = 10 -> passToNext = 1
 * 9 + 0 -> 9 + 1 from above = 10 -> passToNext = 1
 * 9 + 0 -> 9 + 1 from above = 10 -> passToNext = 1
 * 1
 */
public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int passToNext = 0;

        int sum = l1.val + l2.val;

        if (sum / 10 > 0) {
            passToNext = 1;
        }

        ListNode lnLast = new ListNode(sum % 10);

        if (l1.next == null && l2.next == null) {

            if (passToNext > 0) {
                lnLast.next = new ListNode(passToNext);
            }

            return lnLast;

        }

        if (l1.next == null) {
            lnLast.next = addTwoNumbers(new ListNode(passToNext), l2.next);
            return lnLast;
        }

        if (l2.next == null) {
            lnLast.next = addTwoNumbers(l1.next, new ListNode(passToNext));
            return lnLast;
        }

        l1.next.val += passToNext;
        lnLast.next = addTwoNumbers(l1.next, l2.next);

        return lnLast;

    }

    public static void main(String[] args) {

        ListNode ln2 = new ListNode(3);
        ListNode ln1 = new ListNode(4, ln2);
        ListNode ln0 = new ListNode(2, ln1);

        ListNode ln12 = new ListNode(4);
        ListNode ln11 = new ListNode(6, ln12);
        ListNode ln10 = new ListNode(5, ln11);

        ListNode sum = addTwoNumbers(ln0, ln10);

        do {

            System.out.println(sum.val);

            sum = sum.next;

        } while (sum != null);

    }

}
