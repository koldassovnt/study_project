package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * <p>
 * Input: nums = [3,2,3]
 * Output: 3
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Map.Entry<Integer, Integer> maxEntry = map.entrySet()
                .stream()
                .filter(e -> e.getValue() > (n / 2))
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        return maxEntry.getKey();

    }

    public static void main(String[] args) {

        MajorityElement majorityElement = new MajorityElement();

        int[] nums0 = {3, 2, 3};

        int[] nums1 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement.majorityElement(nums0));

        System.out.println(majorityElement.majorityElement(nums1));


    }

}
