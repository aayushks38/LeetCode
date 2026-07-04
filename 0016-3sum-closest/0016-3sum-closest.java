class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;

        int closest = arr[0] + arr[1] + arr[2];
        int minDiff = Math.abs(target - closest);

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                int diff = Math.abs(target - sum);

                if (diff < minDiff) {
                    minDiff = diff;
                    closest = sum;
                }

                if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return closest;
    }
}