class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;
        int missingnumber;
        int t_sum = n * (n+1)/2;
        int actualsum = 0;

        for(int i =0; i<n; i++){
            actualsum+=nums[i];
        }
        missingnumber = t_sum - actualsum;
        return missingnumber;
    }
}