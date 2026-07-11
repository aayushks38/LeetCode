class Solution {
    public void sortColors(int[] nums) {
            int left = 0;
            int right = 0;  
            int n = nums.length;

            while (right < n) {
                if (nums[right] == 0) {
                    swap(nums, left, right);
                    left++;
                }
                right++;
            }

            right=left;
            while (right < n) {
                if (nums[right] == 1) {
                    swap(nums, left, right);
                    left++;
                }
                right++;
            }
        }
    public void swap(int[] nums, int i, int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
}

