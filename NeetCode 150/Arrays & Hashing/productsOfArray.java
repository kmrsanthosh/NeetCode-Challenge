// Solved On: 15/07/2024

// Question:
// Given an integer array nums, return an array output where output[i] is the product of all the elements of nums except nums[i].

// Example 1:
//     Input: nums = [1,2,4,6]
//     Output: [48,24,12,8]

public class productsOfArray {
    static int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];
        int pre = 1, post = 1;

        for (int i = 0; i < nums.length; i++) {
            arr[i] = pre;
            pre = pre * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] = post * arr[i];
            post = post * nums[i];

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = productExceptSelf(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
