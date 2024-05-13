package leetcode;

public class P0861 {
    public int matrixScore(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        for (int r=0 ; r<row ; r++) {
            // flip
            if (grid[r][0] == 0) {
                for (int c=0 ; c<col ; c++) {
                    grid[r][c] = 1 - grid[r][c];
                }
            }
        }
        for (int c=1 ; c<col ; c++) {
            int sum = 0;
            for (int r=0 ; r<row ; r++) {
                sum += grid[r][c];
            }
            // flip
            if (row/2 >= sum) {
                for (int r=0 ; r<row ; r++) {
                    grid[r][c] = 1 - grid[r][c];
                }
            }
        }

        int result = 0;
        for (int[] g : grid) {
            for (int c=0 ; c<col; c++) {
                int columnScore = g[c] << (col - c - 1);
                result += columnScore;
            }
        }
        return result;
    }
}
