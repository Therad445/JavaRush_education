package com.javarush.task.pro.task07.task0701;

import java.util.Arrays;

public class Solution
{
    public static int[] twoSum(int[] nums, int target) {
        int[] outArr = new int[2];
        for(int i=0; i<nums.length; i++) {
            if (target == nums[i] + nums[i+1]) {
                outArr[0] = i;
                outArr[1] = i+1;
                break;
            }
        }
        return outArr;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
