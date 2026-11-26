class Solution {
    public int sumSubseqWidths(int[] nums) {
        int len = nums.length;
        int MOD = (int) Math.pow(10, 9) + 7;

        long[] cal = new long[len];
        long sum = 0;
        for(int i = 1;i < len;i++){
            cal[i] = (cal[i] + (sum+1)%MOD)%MOD;
            sum = (sum + cal[i])%MOD;
            cal[i] = (cal[i] + cal[i-1])%MOD;
        }

        Arrays.sort(nums);
        long ans = 0;
        long ttl = 0;
        for(int i = 0;i < len-1;i++){
            int diff = nums[i+1] - nums[i];
            ttl += cal[len-1-i];
            ttl -= cal[i];

            ans = (ans + (diff*ttl)%MOD)%MOD;
        }

        return (int)ans;
    }
}