
class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) != (divisor < 0);

        long div = Math.abs((long) dividend);
        long divi = Math.abs((long) divisor);

        long count = 0;

        while (div >= divi) {

            long currentDivisor = divi;
            long multiple = 1;

            while ((currentDivisor << 1) <= div) {
                currentDivisor = currentDivisor << 1;
                multiple = multiple << 1;
            }

            div = div - currentDivisor;
            count = count + multiple;
        }

        if (negative) {
            count = -count;
        }

        return (int) count;
    }
}
