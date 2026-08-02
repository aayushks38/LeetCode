#include <stdio.h>
#include <limits.h>

int getCost(int startAt, int moveCost, int pushCost, int minutes, int seconds) {
    int digits[4];

    digits[0] = minutes / 10;
    digits[1] = minutes % 10;
    digits[2] = seconds / 10;
    digits[3] = seconds % 10;

    int i = 0;
    while (i < 3 && digits[i] == 0)
        i++;

    int cost = 0;
    int finger = startAt;

    for (; i < 4; i++) {
        if (finger != digits[i]) {
            cost += moveCost;
            finger = digits[i];
        }
        cost += pushCost;
    }

    return cost;
}

int minCostSetTime(int startAt, int moveCost, int pushCost, int targetSeconds) {
    int ans = INT_MAX;

    int minutes = targetSeconds / 60;
    int seconds = targetSeconds % 60;

    if (minutes <= 99) {
        int cost = getCost(startAt, moveCost, pushCost, minutes, seconds);
        if (cost < ans)
            ans = cost;
    }

    if (minutes > 0 && seconds + 60 <= 99) {
        int cost = getCost(startAt, moveCost, pushCost,
                           minutes - 1, seconds + 60);
        if (cost < ans)
            ans = cost;
    }

    return ans;
}