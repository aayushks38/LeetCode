class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            int week = (i-1)/7;
            int day = (i-1)%7;

            int current = week + day+1;
            sum+=current;
        }
        return sum;
    }
}