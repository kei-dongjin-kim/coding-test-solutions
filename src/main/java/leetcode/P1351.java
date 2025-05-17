package leetcode;

public class P1351 {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] b : grid) {
            for (int a : b) {
                if (a < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
