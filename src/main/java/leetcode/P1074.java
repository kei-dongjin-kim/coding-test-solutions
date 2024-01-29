package leetcode;

import java.util.HashMap;

public class P1074 {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {

        int r_length = matrix.length;
        int c_length = matrix[0].length;

        for (int row=0 ; row<r_length ; row++) {
            for (int col=1; col<c_length ; col++) {
                matrix[row][col] += matrix[row][col - 1];
            }
        }

        int count = 0;
        int prefixSum = 0;

        for (int c1=0 ; c1<c_length ; c1++) {
            for (int c2=c1 ; c2<c_length ; c2++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);
                prefixSum = 0;

                for (int row=0 ; row<r_length ; row++) {
                    prefixSum += matrix[row][c2] - (c1 > 0 ? matrix[row][c1 - 1] : 0);
                    count += map.getOrDefault(prefixSum - target, 0);
                    map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
                }
            }
        }

        return count;
    }
}
