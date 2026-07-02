class Solution {
    public boolean check(int[] nums) {
    /* only for 1st test case valid
        int min = nums[0];
        int index = 0;
        int n = nums.length;
        for(int i =1; i<n; i++){
            if(nums[i] < min){
                min = nums[i];
                index = i;
            }
        }
        int k = n - index;

        if(k == 0){
            return false;
        }
        return true;
    */
    int n = nums.length;
    int count = 0;
    for(int i =0; i<n; i++){
        if(nums[i] > nums[(i+1) % n]){
            count++;
        }
    }
    return count <=1;
    }
}