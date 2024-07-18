// Solved On: 18/07/2024

// Question:
// You are given an integer array heights where heights[i] represents the height of the ith bar.
// You may choose any two bars to form a container. Return the maximum amount of water a container can store.

// Example 1:
//     Input: height = [1,7,2,5,4,7,3,6]
//     Output: 36

public class maxWaterContainer {
    static int maxArea(int[] height) {
        int res = 0, l = 0, r = height.length - 1;
        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            res = Math.max(res, area);
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = { 1, 7, 2, 5, 4, 7, 3, 6 };
        System.out.println(maxArea(height));
    }

}
