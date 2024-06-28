package leetcode;

import java.util.Arrays;

public class P2285 {
    public long maximumImportance(int n, int[][] roads) {
        long[] degree = new long[n];
        for (int[] r : roads) {
            degree[r[0]]++;
            degree[r[1]]++;
        }
        Arrays.sort(degree);
        long sum = 0;
        for (int i=0 ; i<degree.length ; i++) {
            sum += degree[i] * (i+1);
        }
        return sum;
    }
}
