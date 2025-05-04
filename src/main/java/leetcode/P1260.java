package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        for (int a = 0; a < k; a++) {
            int[][] tmp = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == n - 1) {
                        if (i == m - 1) {
                            tmp[0][0] = grid[i][j];
                        } else {
                            tmp[i + 1][0] = grid[i][j];
                        }
                    } else {
                        tmp[i][j + 1] = grid[i][j];
                    }
                }
            }
            grid = tmp;
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                tmp.add(grid[i][j]);
            }
            result.add(tmp);
        }
        return result;
    }
}
