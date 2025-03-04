package leetcode;

public class P0832 {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][n - 1 - j] = image[i][j] == 0 ? 1 : 0;
            }
        }
        return result;
    }
}
