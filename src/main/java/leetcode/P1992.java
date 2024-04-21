package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1992 {
    public int[][] findFarmland(int[][] land) {
        int rows = land.length;
        int cols = land[0].length;
        List<int[]> ans = new ArrayList<>();

        for (int row1 = 0; row1 < rows; row1++) {
            for (int col1 = 0; col1 < cols; col1++) {
                if (land[row1][col1] == 1) {
                    int x = row1, y = col1;

                    for (x = row1; x < rows && land[x][col1] == 1; x++) {
                        for (y = col1; y < cols && land[x][y] == 1; y++) {
                            land[x][y] = 0;
                        }
                    }

                    int[] arr = new int[] {row1, col1, x - 1, y - 1};
                    ans.add(arr);
                }
            }
        }
        return ans.toArray(int[][]::new);
    }
}
