package leetcode;

public class P0200 {
    int[][] memo;
    public int numIslands(char[][] grid) {
        int max = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        memo = new int[rows][cols];

        for (int i=0 ; i<rows ; i++) {
            for (int j=0 ; j<cols ; j++) {
                if (grid[i][j] == '1' && memo[i][j] == 0) {
                    max++;
                    trace(grid, i, j, max);
                }
            }
        }

        return max;
    }
    public void trace(char[][] grid, int i, int j, int curr) {
        if (i<0 || i>=grid.length || j<0 || j>=grid[0].length || memo[i][j] != 0) return;

        if (grid[i][j] == '1') {
            memo[i][j] = curr;
            trace(grid, i-1, j, curr);
            trace(grid, i+1, j, curr);
            trace(grid, i, j-1, curr);
            trace(grid, i, j+1, curr);
        }
    }
}
