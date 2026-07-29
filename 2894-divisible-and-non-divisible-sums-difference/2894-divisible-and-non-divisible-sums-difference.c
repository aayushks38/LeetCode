int differenceOfSums(int n, int m) {
    int sumofdivisible = 0;
    int sumofnotdivisible = 0;

    for (int i = 1; i <= n; i++) {
        if (i % m == 0) {
            sumofdivisible += i;
        } else {
            sumofnotdivisible += i;
        }
    }

    return sumofnotdivisible - sumofdivisible;
}