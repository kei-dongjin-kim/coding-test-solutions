package leetcode;

import java.util.Arrays;

public class P2706 {
    public int buyChoco(int[] prices, int money) {
        int copied = money;
        Arrays.sort(prices);
        int min = Math.min(2, prices.length);
        for (int i = 0; i < min; i++) {
            copied -= prices[i];
        }
        return copied < 0 ? money : copied;
    }
}
