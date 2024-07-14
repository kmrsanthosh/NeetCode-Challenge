// Solved On: 14/07/2024

// Question:
// Given an integer array nums and an integer k, return the k most frequent elements within the array.
// The test cases are generated such that the answer is always unique.
// You may return the output in any order.

// Example 1:
//     Input: nums = [1,2,2,3,3,3], k = 2
//     Output: [2,3]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class topKElements {
    static int[] findTopKElements(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] List = new List[nums.length + 1];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < List.length; i++) {
            List[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;

        for (int i = List.length - 1; i > 0 && index < k; i--) {
            for (int num : List[i]) {
                result[index++] = num;
                if (index == k) {
                    return result;
                }

            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3 };
        int k = 2;

        int[] result = findTopKElements(nums, k);

        for (int num : result) {
            System.out.println(num);
        }
    }
}
