class Solution {
    public int earliestFinishTime(
            int[] landStartTime, int[] landDuration,
            int[] waterStartTime, int[] waterDuration) {

        int ans1 = calc(landStartTime, landDuration, waterStartTime, waterDuration);
        int ans2 = calc(waterStartTime, waterDuration, landStartTime, landDuration);

        return Math.min(ans1, ans2);
    }

    private int calc(int[] firstStart, int[] firstDuration,
                     int[] secondStart, int[] secondDuration) {

        int minEnd = Integer.MAX_VALUE;

        // Best possible finish time among all rides of the first type
        for (int i = 0; i < firstStart.length; i++) {
            minEnd = Math.min(minEnd, firstStart[i] + firstDuration[i]);
        }

        // Try every ride of the second type after that earliest finish
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < secondStart.length; i++) {
            ans = Math.min(ans, Math.max(minEnd, secondStart[i]) + secondDuration[i]);
        }

        return ans;
    }
}