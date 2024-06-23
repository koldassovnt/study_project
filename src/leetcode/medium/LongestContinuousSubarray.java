package leetcode.medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 * Given an array of integers nums and an integer limit, return the size of the longest non-empty
 * subarray such that the absolute difference between any two elements of this subarray is less than or equal to limit.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [8,2,4,7], limit = 4
 * Output: 2
 * Explanation: All subarrays are:
 * [8] with maximum absolute diff |8-8| = 0 <= 4.
 * [8,2] with maximum absolute diff |8-2| = 6 > 4.
 * [8,2,4] with maximum absolute diff |8-2| = 6 > 4.
 * [8,2,4,7] with maximum absolute diff |8-2| = 6 > 4.
 * [2] with maximum absolute diff |2-2| = 0 <= 4.
 * [2,4] with maximum absolute diff |2-4| = 2 <= 4.
 * [2,4,7] with maximum absolute diff |2-7| = 5 > 4.
 * [4] with maximum absolute diff |4-4| = 0 <= 4.
 * [4,7] with maximum absolute diff |4-7| = 3 <= 4.
 * [7] with maximum absolute diff |7-7| = 0 <= 4.
 * Therefore, the size of the longest subarray is 2.
 * <p>
 * Constraints:
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 109
 * 0 <= limit <= 109
 */
public class LongestContinuousSubarray {

    //Not My Solution
    public static int longestSubarray3(int[] nums, int limit) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int left = 0;
        int longestSubArrLength = 0;

        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.lastKey() - map.firstKey() > limit) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }

            longestSubArrLength = Math.max(longestSubArrLength, right - left + 1);
        }

        return longestSubArrLength;
    }

    //Not My Solution
    public static int longestSubarray2(int[] nums, int limit) {
        Deque<Integer> maxDeque = new LinkedList<>();
        Deque<Integer> minDeque = new LinkedList<>();
        int left = 0;
        int longestSubArrLength = 0;

        for (int right = 0; right < nums.length; right++) {

            while (!maxDeque.isEmpty() && nums[maxDeque.peekLast()] <= nums[right]) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(right);

            while (!minDeque.isEmpty() && nums[minDeque.peekLast()] >= nums[right]) {
                minDeque.pollLast();
            }
            minDeque.offerLast(right);

            while (!maxDeque.isEmpty() && !minDeque.isEmpty() &&
                    nums[maxDeque.peekFirst()] - nums[minDeque.peekFirst()] > limit) {
                left++;
                if (maxDeque.peekFirst() < left) {
                    maxDeque.pollFirst();
                }
                if (minDeque.peekFirst() < left) {
                    minDeque.pollFirst();
                }
            }

            longestSubArrLength = Math.max(longestSubArrLength, right - left + 1);
        }

        return longestSubArrLength;
    }

    public static int longestSubarray(int[] nums, int limit) {

        int longestSubArrAbsDiffCloseToLimitLength = -2500;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i; j < nums.length; j++) {

                int subArrSize = (j + 1) - i;

                int subArrayAbsDiff = getSubArrayAbsDiff(nums, i, subArrSize);

                if (subArrayAbsDiff <= limit &&
                        subArrSize > longestSubArrAbsDiffCloseToLimitLength) {
                    longestSubArrAbsDiffCloseToLimitLength = subArrSize;
                }

            }

        }

        return longestSubArrAbsDiffCloseToLimitLength;

    }

    public static int getSubArrayAbsDiff(int[] nums, int startIdx, int subArrSize) {

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        int subArrIdx = 0;

        for (int i = startIdx; i < nums.length; i++) {

            if (subArrIdx >= subArrSize) {
                break;
            }

            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }

            if (nums[i] < minNum) {
                minNum = nums[i];
            }

            subArrIdx++;

        }

        return maxNum - minNum;

    }

    public static void main(String[] args) {

        int[] nums3 = {8, 2, 4, 7};
        int limit3 = 4;

        System.out.println(longestSubarray(nums3, limit3));

        int[] nums = {10, 1, 2, 4, 7, 2};
        int limit = 5;

        System.out.println(longestSubarray(nums, limit));

        int[] nums2 = {4, 2, 2, 2, 4, 4, 2, 2};
        int limit2 = 0;

        System.out.println(longestSubarray(nums2, limit2));

        int[] nums4 = {24, 12, 71, 33, 5, 87, 10, 11, 3, 58, 2, 97, 97, 36, 32, 35, 15, 80, 24, 45, 38, 9, 22,
                21, 33, 68, 22, 85, 35, 83, 92, 38, 59, 90, 42, 64, 61, 15, 4, 40, 50, 44, 54, 25, 34, 14, 33,
                94, 66, 27, 78, 56, 3, 29, 3, 51, 19, 5, 93, 21, 58, 91, 65, 87, 55, 70, 29, 81, 89, 67, 58,
                29, 68, 84, 4, 51, 87, 74, 42, 85, 81, 55, 8, 95, 39};

        int limit4 = 87;

        System.out.println(longestSubarray(nums4, limit4));

    }

}
