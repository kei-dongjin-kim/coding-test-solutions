package leetcode;

public class P3386 {
    public int buttonWithLongestTime(int[][] events) {
        int max_idx = events[0][0];
        int max_val = events[0][1];
        for (int i = 1; i < events.length; i++) {
            int curr = events[i][1] - events[i - 1][1];
            if (max_val < curr) {
                max_idx = events[i][0];
                max_val = curr;
            } else if (max_val == curr) {
                max_idx = Math.min(max_idx, events[i][0]);
            }
        }
        return max_idx;
    }
}
