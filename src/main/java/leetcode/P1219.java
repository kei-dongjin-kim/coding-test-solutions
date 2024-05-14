package leetcode;

public class P1219 {
    private int rlen;
    private int clen;
    private boolean[][] visited;

    public int getMaximumGold(int[][] grid) {
        rlen = grid.length;
        clen = grid[0].length;
        visited = new boolean[rlen][clen];
        int max = 0;

        for (int r=0 ; r<rlen ; r++) {
            for (int c=0 ; c<clen ; c++) {
                if (grid[r][c] != 0) {
                    max = Math.max(max, trace(grid, visited, r, c));
                }
            }
        }

        return max;
    }
    public int trace(int[][] grid, boolean[][] visited, int r, int c) {
        if (visited[r][c] || grid[r][c] == 0) {
            return 0;
        } else {
            visited[r][c] = true;
        }

        int max = 0;

        if (r-1 >= 0) max = Math.max(max, trace(grid, visited, r-1, c));
        if (r+1 < rlen) max = Math.max(max, trace(grid, visited, r+1, c));
        if (c-1 >= 0) max = Math.max(max, trace(grid, visited, r, c-1));
        if (c+1 < clen) max = Math.max(max, trace(grid, visited, r, c+1));

        visited[r][c] = false;

        return max + grid[r][c];
    }
}
