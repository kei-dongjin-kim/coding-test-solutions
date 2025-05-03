package leetcode;

public class P1217 {
    public int minCostToMoveChips(int[] position) {
        int len = position.length;
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < len; i++) {
            if (position[i] % 2 == 0) {
                count0++;
            } else {
                count1++;
            }
        }
        return Math.min(count0, count1);
    }
}
