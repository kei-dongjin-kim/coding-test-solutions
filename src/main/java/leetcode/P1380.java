package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1380 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int len_row = matrix.length;
        int len_col = matrix[0].length;
        for (int i=0 ; i<len_row ; i++) {
            // finding the minimum value in the row
            int min_idx = 0;
            for (int j=1 ; j<len_col ; j++) {
                if (matrix[i][min_idx] > matrix[i][j]) min_idx = j;
            }

            // checking if the minimum value is the maximum value in the column
            boolean check = true;
            for (int k=0 ; k<len_row ; k++) {
                if (matrix[k][min_idx] > matrix[i][min_idx]) {
                    check = false;
                    break;
                }
            }
            if (check) result.add(matrix[i][min_idx]);
        }
        return result;
    }
}
