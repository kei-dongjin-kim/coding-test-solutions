package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class P0959 {

    // Directions for flood fill
    private static final int[][] DIRECTIONS = {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
    };

    public int regionsBySlashes(String[] grid) {
        int len = grid.length;
        int[][] expanded = new int[len * 3][len * 3];

        for (int i=0 ; i<len ; i++) {
            for (int j=0 ; j<len ; j++) {
                int baseRow = i * 3;
                int baseCol = j * 3;

                if (grid[i].charAt(j) == '\\') {
                    expanded[baseRow][baseCol] = 1;
                    expanded[baseRow + 1][baseCol + 1] = 1;
                    expanded[baseRow + 2][baseCol + 2] = 1;
                } else if (grid[i].charAt(j) == '/') {
                    expanded[baseRow][baseCol + 2] = 1;
                    expanded[baseRow + 1][baseCol + 1] = 1;
                    expanded[baseRow + 2][baseCol] = 1;
                }
            }
        }

        int count = 0;
        for (int i=0 ; i<len * 3 ; i++) {
            for (int j=0 ; j<len * 3 ; j++) {
                if (expanded[i][j] == 0) {
                    floodFill(expanded, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    // Flood fill the region
    private void floodFill(int[][] expanded, int row, int col) {
        Queue<int[]> queue = new LinkedList<>();
        expanded[row][col] = 1;
        queue.add(new int[] {row, col});

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            for (int[] dir : DIRECTIONS) {
                int newRow = dir[0] + curr[0];
                int newCol = dir[1] + curr[1];
                if (isValidCell(expanded, newRow, newCol)) {
                    expanded[newRow][newCol] = 1;
                    queue.add(new int[] {newRow, newCol});
                }
            }
        }
    }

    // Check if the cell is valid and not visited
    private boolean isValidCell(int[][] expanded, int row, int col) {
        int len = expanded.length;
        return (
            row >= 0 &&
            col >= 0 &&
            row < len &&
            col < len &&
            expanded[row][col] == 0
        );
    }

}
