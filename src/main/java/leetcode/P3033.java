package leetcode;

public class P3033 {
    public int[][] modifiedMatrix(int[][] matrix) {
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        int[] max = new int[collen];
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < collen; j++) {
                max[j] = Math.max(max[j], matrix[i][j]);
            }
        }
        for (int i = 0; i < rowlen; i++) {
            for (int j = 0; j < collen; j++) {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = max[j];
                }
            }
        }
        return matrix;
    }
}
