class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {

        if (sx == fx && sy == fy && t == 1) {
            return false;
        }

        int dx = Math.abs(fx - sx);
        int dy = Math.abs(fy - sy);

        return Math.max(dx, dy) <= t;
    }
}