// Solved On: 13/07/2024

// Question:
// Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
// You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
// Return the answer with the smaller index first.

// Example 1:
//     Input: nums = [3,4,5,6], target = 7
//     Output: [0,1]

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    static int[] findTwoIntSum(int[] nums, int target) {

        int diff = 0, i = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            diff = target - num;
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            } else {
                map.put(num, i);
                System.out.println(map);
            }
            i = i + 1;
        }

        return new int[] {};

    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 6 };
        int target = 7;

        int[] temp = findTwoIntSum(nums, target);

        for (int i : temp) {
            System.out.println(i);
        }
    }
}
