package leetcode.easy;

import java.util.Arrays;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed.
 * Then return the number of elements in nums which are not equal to val.
 * <p>
 * Consider the number of elements in nums which are not equal to val be k,
 * to get accepted, you need to do the following things:
 * <p>
 * Change the array nums such that the first k elements of nums contain the
 * elements which are not equal to val.
 * The remaining elements of nums are not important as well as the size of nums.
 * Return k.
 * <p>
 * The judge will test your solution with the following code:
 * <p>
 * int[] nums = [...]; // Input array
 * int val = ...; // Value to remove
 * int[] expectedNums = [...]; // The expected answer with correct length.
 *                             // It is sorted with no values equaling val.
 * <p>
 * int k = removeElement(nums, val); // Calls your implementation
 * <p>
 * assert k == expectedNums.length;
 * sort(nums, 0, k); // Sort the first k elements of nums
 * for (int i = 0; i < actualLength; i++) {
 *     assert nums[i] == expectedNums[i];
 * }
 * If all assertions pass, then your solution will be accepted.
 * <p>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2,_,_]
 * Explanation: Your function should return k = 2, with the first two elements of nums being 2.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 * <p>
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3,_,_,_]
 * Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
 * Note that the five elements can be returned in any order.
 * It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveElement {

    public int removeElementShorterSolution(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public int removeElement(int[] nums, int val) {

        int goodNumId = -1;
        int removeNumId = -1;
        int count = 0;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (nums[i] == val) {

                removeNumId = i;

                if (goodNumId != -1 && removeNumId < goodNumId) {
                    int temp = nums[goodNumId];
                    nums[goodNumId] = nums[i];
                    nums[i] = temp;
                    goodNumId--;
                }

            } else {

                if (goodNumId == -1) {
                    goodNumId = i;
                }

                count++;

            }

        }

        return count;

    }

    public static void main(String[] args) {

        RemoveElement removeElement = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;

        int res1 = removeElement.removeElement(nums1, val1);
        System.out.println(res1);
        System.out.println(Arrays.toString(nums1));

        int res2 = removeElement.removeElement(nums2, val2);
        System.out.println(res2);
        System.out.println(Arrays.toString(nums2));

    }

}
