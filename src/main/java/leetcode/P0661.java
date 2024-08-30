package leetcode;

public class P0661 {
    public int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int col = img[0].length;
        int[][] result = new int[row][col];
        for (int r=0 ; r<row ; r++) {
            for (int c=0 ; c<col ; c++) {
                result[r][c] = helper(img, r, c);
            }
        }
        return result;
    }

    private int helper(int[][] img, int r, int c) {
        int row = img.length;
        int col = img[0].length;
        int sum = 0;
        int count = 0;

        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i >= 0 && i < row && j >= 0 && j < col) {
                    sum += img[i][j];
                    count++;
                }
            }
        }

        return sum / count;
    }
}
