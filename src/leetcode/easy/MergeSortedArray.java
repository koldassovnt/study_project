package leetcode.easy;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 * <p>
 * Input: nums1 = [1], m = 1, nums2 = [], n = 0
 * Output: [1]
 * Explanation: The arrays we are merging are [1] and [].
 * The result of the merge is [1].
 * <p>
 * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
 * Output: [1]
 * Explanation: The arrays we are merging are [] and [1].
 * The result of the merge is [1].
 * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1, j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {

            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }

        }

    }

    public static void main(String[] args) {

        MergeSortedArray mergeSortedArray = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m0 = 3;
        int[] nums2 = {2, 5, 6};
        int n0 = 3;

        mergeSortedArray.merge(nums1, m0, nums2, n0);

        System.out.println(Arrays.toString(nums1)); //expect [1,2,2,3,5,6]

        int[] nums3 = {1};
        int m1 = 1;
        int[] nums4 = {};
        int n1 = 0;

        mergeSortedArray.merge(nums3, m1, nums4, n1);

        System.out.println(Arrays.toString(nums3)); //expect [1]

        int[] nums5 = {0};
        int m2 = 0;
        int[] nums6 = {1};
        int n2 = 1;

        mergeSortedArray.merge(nums5, m2, nums6, n2);

        System.out.println(Arrays.toString(nums5)); //expect [1]

        int[] nums7 = {2, 0};
        int m3 = 1;
        int[] nums8 = {1};
        int n3 = 1;

        mergeSortedArray.merge(nums7, m3, nums8, n3);

        System.out.println(Arrays.toString(nums7)); //expect [1, 2]

        int[] nums9 = {4,5,6,0,0,0};
        int m4 = 3;
        int[] nums10 = {1,2,3};
        int n4 = 3;

        mergeSortedArray.merge(nums9, m4, nums10, n4);

        System.out.println(Arrays.toString(nums9)); //expect [1,2,3,4,5,6]

    }

}
