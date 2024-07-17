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
