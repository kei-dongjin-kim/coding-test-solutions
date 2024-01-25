package leetcode;

public class P0121 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int dp_min = prices[0];
        int curr = 0;

        for (int price : prices) {
            curr = price - dp_min;
            if (max < curr) max = curr;
            if (dp_min > price) dp_min = price;
        }

        return max;
    }
}
