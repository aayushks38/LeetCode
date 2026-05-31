import java.util.Arrays;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int i = 0;
        int j = n - 1;
        int k = n - 1;

        while (i <= j) {

            int leftSquare = nums[i] * nums[i];
            int rightSquare = nums[j] * nums[j];

            if (leftSquare > rightSquare) {
                ans[k] = leftSquare;
                i++;
            } else {
                ans[k] = rightSquare;
                j--;
            }

            k--;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}