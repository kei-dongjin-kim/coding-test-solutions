package leetcode;

import java.util.Arrays;

public class P0931 {
    public int minFallingPathSum(int[][] matrix) {
        int[][] sub = new int[matrix.length][matrix.length];
        for (int[] tmp : sub) {
            Arrays.fill(tmp, Integer.MAX_VALUE);
        }
        System.arraycopy(matrix[0], 0, sub[0], 0, matrix.length);

        // sub table value is the minimum sum of the path from the top to the current position
        // sub[i][j] = min(sub[i-1][j-1], sub[i-1][j], sub[i-1][j+1]) + matrix[i][j]
        for (int row=1 ; row<matrix.length ; row++) {
            for (int col=0 ; col<matrix.length ; col++) {
                if (col == 0) {
                    sub[row][col] = Math.min(sub[row-1][col], sub[row-1][col+1]) + matrix[row][col];
                } else if (col == matrix.length - 1) {
                    sub[row][col] = Math.min(sub[row-1][col-1], sub[row-1][col]) + matrix[row][col];
                } else {
                    sub[row][col] = Math.min(Math.min(sub[row-1][col-1], sub[row-1][col]), sub[row-1][col+1]) + matrix[row][col];
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i=0 ; i<matrix.length ; i++) {
            min = Math.min(sub[matrix.length-1][i], min);
        }
        return min;
    }
}
