package leetcode;

import java.util.Stack;

public class P0085 {
    public int maximalRectangle(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] dp = new int[row][col];
        int max = 0;

        for (int i=0 ; i<row ; i++) {
            for (int j=0 ; j<col ; j++) {
                if (i == 0) {
                    dp[i][j] = matrix[i][j] - '0';
                } else {
                    dp[i][j] = matrix[i][j] == '1' ? dp[i-1][j] + 1 : 0;
                }
            }
        }

        for (int i=0 ; i<row ; i++) {
            max = Math.max(max, largestRectangleHistogram(dp[i]));
        }

        return max;
    }

    public int largestRectangleHistogram(int[] h) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= h.length; i++) {
            int height = (i == h.length) ? 0 : h[i];
            while (!stack.isEmpty() && h[stack.peek()] >= height) {
                int curHeight = h[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, curHeight * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

    public int largestRectangleHistogram0(int [] h) {
        if (h == null || h.length == 0)
            return 0;
        int len = h.length;
        int [] left = new int [len];
        int [] right = new int [len];
        int max = 0;
        left[0] = -1;
        right[len - 1] = len;

        // Find the first left index which is less than the current index
        for (int i=1; i<len; i++) {
            int leftBarIndex = i - 1;
            while (leftBarIndex >= 0 && h[leftBarIndex] >= h[i]) {
                leftBarIndex = left[leftBarIndex];
            }
            left[i] = leftBarIndex;
        }
        // Find the first right index which is less than the current index
        for (int i=len - 2; i>=0; i--) {
            int currentIndex = i + 1;
            while (currentIndex < len && h[currentIndex] >= h[i]) {
                currentIndex = right[currentIndex];
            }
            right[i] = currentIndex;
        }
        // Calculate the area
        for (int i=0; i<len; i++) {
            max = Math.max(max, h[i] * (right[i] - left[i] - 1));
        }
        return max;
    }
}
