package leetcode;

public class P3142 {
    public boolean satisfiesConditions(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] != grid[i + 1][j]) {
                    return false;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c - 1; j++) {
                if (grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
