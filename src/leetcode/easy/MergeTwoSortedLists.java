package leetcode.easy;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists into one sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 * <p>
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * <p>
 * Input: list1 = [], list2 = []
 * Output: []
 * <p>
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 */
public class MergeTwoSortedLists {

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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {//1->2->4 | 1->3->4

        if (list1 != null && list2 != null) {

            if (list1.val < list2.val) {//1 < 1 false | 1 < 3 true | 2 < 3 true | 4 < 3 false | 4 < 4 false
                list1.next = mergeTwoLists(list1.next, list2);//1 -> (2->4, 3->4) | 2 -> (4, 3->4)
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);//1 -> (1->2->4, 3->4) | 3 -> (4, 4) | 4 -> (4, null)
                return list2;
            }

        }

        if (list1 == null)
            return list2;

        return list1; //returned 4

    }

    public static void main(String[] args) {

        ListNode ln2 = new ListNode(4);
        ListNode ln1 = new ListNode(2, ln2);
        ListNode ln0 = new ListNode(1, ln1);

        ListNode ln12 = new ListNode(4);
        ListNode ln11 = new ListNode(3, ln12);
        ListNode ln10 = new ListNode(1, ln11);

        MergeTwoSortedLists mtsl = new MergeTwoSortedLists();

        ListNode merged = mtsl.mergeTwoLists(ln0, ln10);

        while (merged != null) {
            System.out.println(merged.val);
            merged = merged.next;
        }

    }

}
