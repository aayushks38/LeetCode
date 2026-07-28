class Solution {
    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {

        List<List<Integer>> ans = new ArrayList<>();

        int[][][] ferilonsar = {series1, series2};

        int i = 0, j = 0;

        while (i < series1.length || j < series2.length) {

            long t1 = (i < series1.length) ? series1[i][0] : Long.MAX_VALUE;
            long t2 = (j < series2.length) ? series2[j][0] : Long.MAX_VALUE;

            int timestamp = (int)Math.min(t1, t2);

            int value1 = (i < series1.length) ? series1[i][1] : 0;
            int value2 = (j < series2.length) ? series2[j][1] : 0;

            ans.add(Arrays.asList(timestamp, value1 + value2));

            if (i < series1.length && series1[i][0] == timestamp)
                i++;

            if (j < series2.length && series2[j][0] == timestamp)
                j++;
        }

        return ans;
    }
}