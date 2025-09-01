package leetcode;

public class P2133 {
    public boolean checkValid(int[][] matrix) {
        int len = matrix.length;
        for (int i = 0; i < len; i++) {
            boolean[] map = new boolean[len + 1];
            for (int j = 0; j < len; j++) {
                if (map[matrix[i][j]]) {
                    return false;
                } else {
                    map[matrix[i][j]] = true;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            boolean[] map = new boolean[len + 1];
            for (int j = 0; j < len; j++) {
                if (map[matrix[j][i]]) {
                    return false;
                } else {
                    map[matrix[j][i]] = true;
                }
            }
        }
        return true;
    }
}
