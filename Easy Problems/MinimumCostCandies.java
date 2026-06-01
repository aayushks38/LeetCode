import java.util.Arrays;

public class MinimumCostCandies {

    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int totalCost = 0;

        for (int i = cost.length - 1, count = 1; i >= 0; i--, count++) {
            if (count % 3 != 0) {
                totalCost += cost[i];
            }
        }

        return totalCost;
    }

    public static void main(String[] args) {
        int[] cost = {6, 5, 7, 9, 2, 2};

        System.out.println(minimumCost(cost));
    }
}