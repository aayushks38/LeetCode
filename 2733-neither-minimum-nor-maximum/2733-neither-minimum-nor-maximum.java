class Solution {
    public int findNonMinOrMax(int[] nums) {
        // Intuition: check each num against every other num
        if (nums.length <= 2) return -1;
        for (int i = 0; i < nums.length; i++) {
            boolean isMin = true;
            boolean isMax = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) isMin = false;
                if (nums[j] > nums[i]) isMax = false;
            }
            if (!isMin && !isMax) return nums[i];
        }
        return -1;
    }
}