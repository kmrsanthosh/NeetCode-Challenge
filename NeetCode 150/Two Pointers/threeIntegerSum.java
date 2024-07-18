// Solved On: 18/07/2024

// Question:
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] where nums[i] + nums[j] + nums[k] == 0, and the indices i, j and k are all distinct.
// The output should not contain any duplicate triplets. You may return the output and the triplets in any order.

// Example 1:
//     Input: nums = [-1,0,1,2,-1,-4]
//     Output: [[-1,-1,2],[-1,0,1]]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeIntegerSum {

    static List<List<Integer>> findThreeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int l = i + 1, r = nums.length - 1, sum = 0 - nums[i];

                while (l < r) {
                    if (nums[l] + nums[r] == sum) {
                        result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                        while (l < r && nums[l] == nums[l + 1])
                            l++;
                        while (l < r && nums[r] == nums[r - 1])
                            r--;

                        l++;
                        r--;
                    } else if (nums[l] + nums[r] < sum)
                        l++;
                    else
                        r--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(findThreeSum(nums));
    }

}
