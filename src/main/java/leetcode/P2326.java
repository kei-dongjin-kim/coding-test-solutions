package leetcode;

import java.util.Arrays;

public class P2326 {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] result = new int[m][n];
        for (int[] row : result) {
            Arrays.fill(row, -1);
        }

        int i = 0;
        int j = 0;
        int curr = 0;
        int[][] move = new int[][] {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}
        };
        while (head != null) {
            result[i][j] = head.val;
            int newi = i + move[curr][0];
            int newj = j + move[curr][1];

            if (
                Math.min(newi, newj) < 0 ||
                newi >= m ||
                newj >= n ||
                result[newi][newj] != -1
            ) {
                curr = (curr + 1) % 4;
            }

            i += move[curr][0];
            j += move[curr][1];

            head = head.next;
        }

        return result;
    }
}
