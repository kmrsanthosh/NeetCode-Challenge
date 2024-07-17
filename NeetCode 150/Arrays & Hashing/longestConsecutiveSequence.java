// Solved On: 17/07/2024

// Question:
// Given an array of integers nums, return the length of the longest consecutive sequence of elements.
// A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element.
// You must write an algorithm that runs in O(n) time.

// Example 1:
//     Input: nums = [2,20,4,10,3,4,5]
//     Output: 4

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSequence {

    static int longestConsecutive(int[] nums) {
        Set<Integer> hashset = new HashSet<>();

        for (int num : nums) {
            hashset.add(num);
        }

        int len = 0;

        for (int num : hashset) {
            if (!hashset.contains(num - 1)) {
                int length = 1;
                while (hashset.contains(num + length)) {
                    length += 1;
                }
                len = Math.max(len, length);
            }
        }

        return len;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 20, 4, 10, 3, 4, 5 };
        System.out.println(longestConsecutive(nums));
    }
}
