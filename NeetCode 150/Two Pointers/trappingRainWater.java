// Solved On: 19/07/2024

// Question:
// You are given an array non-negative integers heights which represent an elevation map. Each value heights[i] represents the height of a bar, which has a width of 1.
// Return the maximum area of water that can be trapped between the bars.

// Example 1:
//     Input: height = [0,2,0,3,1,0,1,3,2,1]
//     Output: 9

public class trappingRainWater {
    static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int res = 0;
        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] height = { 0, 2, 0, 3, 1, 0, 1, 3, 2, 1 };
        System.out.println(trap(height));
    }
}
