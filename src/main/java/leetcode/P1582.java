package leetcode;

public class P1582 {
    public int numSpecial(int[][] mat) {
        int count = 0;
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    int sum = 0;
                    for (int k = 0; k < row; k++) {
                        sum += mat[k][j];
                    }
                    if (sum == 1) {
                        sum = 0;
                        for (int l = 0; l < col; l++) {
                            sum += mat[i][l];
                        }
                        if (sum == 1) {
                            count++;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return count;
    }
}
