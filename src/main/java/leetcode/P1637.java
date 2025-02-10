package leetcode;

import java.util.Arrays;

public class P1637 {
    public int maxWidthOfVerticalArea(int[][] points) {
        int len = points.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        int max = 0;
        for (int i = 1; i < len; i++) {
            max = Math.max(max, arr[i] - arr[i - 1]);
        }
        return max;
    }
}
