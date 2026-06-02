class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int low = 0;
        int high = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        while (high < nums.length) {

            sum += nums[high];

            if (high - low + 1 < k) {
                high++;
            }
            else if (high - low + 1 == k) {

                maxSum = Math.max(maxSum, sum);

                sum -= nums[low];
                low++;
                high++;
            }
        }

        return (double) maxSum / k;
    }
}