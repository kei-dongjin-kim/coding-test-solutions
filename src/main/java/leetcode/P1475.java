package leetcode;

public class P1475 {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (prices[i] >= prices[j]) {
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}
