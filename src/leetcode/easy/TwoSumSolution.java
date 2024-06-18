package leetcode.easy;

import java.util.Arrays;

public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        boolean end = false;

        for (int i = 0; i < nums.length; i++) {

            res[0] = i;

            for (int j = (i + 1); j < nums.length; j++) {

                res[1] = j;

                if ((nums[res[0]] + nums[res[1]]) == target) {
                    end = true;
                    break;
                }

            }

            if (end) {
                break;
            }

        }

        return res;

    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};

        int target = 9;

        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] res = twoSumSolution.twoSum(nums, target);

        System.out.println(Arrays.toString(res));

    }

}
