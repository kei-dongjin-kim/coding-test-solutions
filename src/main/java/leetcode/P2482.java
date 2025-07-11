package leetcode;

public class P2482 {
    public int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] rowsum = new int[row];
        int[] colsum = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    rowsum[i]++;
                    colsum[j]++;
                } else {
                    rowsum[i]--;
                    colsum[j]--;
                }
            }
        }
        int[][] diff = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                diff[i][j] = rowsum[i] + colsum[j];
            }
        }
        return diff;
    }
}
