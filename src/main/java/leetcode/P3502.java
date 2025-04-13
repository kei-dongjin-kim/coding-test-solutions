package leetcode;

public class P3502 {
    public int[] minCosts(int[] cost) {
        for (int i = 1; i < cost.length; i++) {
            if (cost[i - 1] < cost[i]) {
                cost[i] = cost[i - 1];
            }
        }
        return cost;
    }
}
