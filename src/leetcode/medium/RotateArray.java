package leetcode.medium;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 * <p>
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * <p>
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {

        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

    }

    public void reverse(int[] nums, int start, int end) {

        int temp;

        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {

        RotateArray rotateArray = new RotateArray();

        int[] nums0 = {1, 2, 3, 4, 5, 6, 7};
        int k0 = 3;

        int[] nums1 = {-1, -100, 3, 99};
        int k1 = 2;

        int[] nums2 = {1, 2};
        int k2 = 1;

        rotateArray.rotate(nums0, k0);
        rotateArray.rotate(nums1, k1);
        rotateArray.rotate(nums2, k2);

        System.out.println(Arrays.toString(nums0));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }

}
