// Solved On: 13/07/2024

// Question:
// Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

// Example 1:
//     Input: nums = [1, 2, 3, 3]
//     Output: true

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

    static boolean findDuplicateInt(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 3, };
        System.out.println(findDuplicateInt(nums));

    }
}