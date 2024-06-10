package leetcode;

import java.util.Arrays;

public class P1051 {
    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] sorted = new int[len];
        System.arraycopy(heights, 0, sorted, 0, len);
        Arrays.sort(sorted);
        int count = 0;
        for (int i=0 ; i<len ; i++) {
            if (heights[i] != sorted[i]) {
                count++;
            }
        }
        return count;
    }
}
