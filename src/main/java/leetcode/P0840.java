package leetcode;

public class P0840 {
    public int numMagicSquaresInside(int[][] grid) {
        int rowlen = grid.length;
        int collen = grid[0].length;
        if (rowlen < 3 || collen < 3) return 0;

        int count = 0;
        for (int i = 0; i <= rowlen - 3; i++) {
            for (int j = 0; j <= collen - 3; j++) {
                if (isMagicSquare(grid, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isMagicSquare(int[][] grid, int row, int col) {
        int[] freq = new int[10];
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                int num = grid[i][j];
                if (num < 1 || num > 9 || freq[num]++ > 0) {
                    return false;
                }
            }
        }

        return (grid[row][col] + grid[row][col + 1] + grid[row][col + 2] == 15) &&
                (grid[row + 1][col] + grid[row + 1][col + 1] + grid[row + 1][col + 2] == 15) &&
                (grid[row + 2][col] + grid[row + 2][col + 1] + grid[row + 2][col + 2] == 15) &&
                (grid[row][col] + grid[row + 1][col] + grid[row + 2][col] == 15) &&
                (grid[row][col + 1] + grid[row + 1][col + 1] + grid[row + 2][col + 1] == 15) &&
                (grid[row][col + 2] + grid[row + 1][col + 2] + grid[row + 2][col + 2] == 15) &&
                (grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2] == 15) &&
                (grid[row + 2][col] + grid[row + 1][col + 1] + grid[row][col + 2] == 15);
    }
}