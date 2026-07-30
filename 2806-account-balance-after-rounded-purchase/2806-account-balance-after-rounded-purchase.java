class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int roundedAmount = Math.round(purchaseAmount / 10.0f) * 10;
        return 100 - roundedAmount;
    }
}