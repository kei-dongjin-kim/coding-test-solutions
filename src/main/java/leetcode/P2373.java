package leetcode;

public class P2373 {
    public int[][] largestLocal(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] result = new int[row - 2][col - 2];
        for (int i=0 ; i<row-2 ; i++) {
            for (int j=0 ; j<col-2 ; j++) {
                int max = 0;
                for (int x=i ; x<i+3 ; x++) {
                    for (int y=j ; y<j+3 ; y++) {
                        max = Math.max(max, grid[x][y]);
                    }
                }
                result[i][j] = max;
            }
        }
        return result;
    }
}
