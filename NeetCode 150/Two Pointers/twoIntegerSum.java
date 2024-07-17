// Solved On: 17/07/2024

// Question:
// Given an array of integers numbers that is sorted in non-decreasing order.
// Return the indices (1-indexed) of two numbers, [index1, index2], such that they add up to a given target number target and index1 < index2. Note that index1 and index2 cannot be equal, therefore you may not use the same element twice.
// There will always be exactly one valid solution.

// Example 1:
//     Input: numbers = [1,2,3,4], target = 3
//     Output: [1,2]

import java.util.Arrays;

public class twoIntegerSum {
    static int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum == target)
                return new int[] { l + 1, r + 1 };
            else if (sum < target)
                l++;
            else if (sum > target)
                r--;

        }

        return new int[] {};

    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        int target = 3;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
