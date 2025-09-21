package leetcode;

public class P3643 {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int a = 1;
        for (int i = x; i < x + (k / 2); i++) {
            for (int j = y; j < y + k; j++) {
                int tmp = grid[i][j];
                grid[i][j] = grid[i + k - a][j];
                grid[i + k - a][j] = tmp;
            }
            a += 2;
        }
        return grid;
    }
}
