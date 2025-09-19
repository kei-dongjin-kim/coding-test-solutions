package leetcode;

import java.util.Arrays;

public class P2144 {
    public int minimumCost(int[] cost) {
        int sum = 0;
        Arrays.sort(cost);
        int idx = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            idx++;
            if (idx % 3 != 0) {
                sum += cost[i];
            }
        }
        return sum;
    }
}
