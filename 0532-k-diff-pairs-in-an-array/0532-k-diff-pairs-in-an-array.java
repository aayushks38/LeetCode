
import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {

        if (k < 0) {
            return 0;
        }

        Arrays.sort(nums);

        int left = 0;
        int right = 1;
        int paircount = 0;

        while (right < nums.length) {

            if (left == right) {
                right++;
                continue;
            }

            int diff = nums[right] - nums[left];

            if (diff == k) {
                paircount++;

                int leftValue = nums[left];
                int rightValue = nums[right];

                // Skip duplicate values
                while (left < nums.length && nums[left] == leftValue) {
                    left++;
                }

                while (right < nums.length && nums[right] == rightValue) {
                    right++;
                }

            } else if (diff < k) {
                right++;
            } else {
                left++;
            }
        }

        return paircount;
    }
}
