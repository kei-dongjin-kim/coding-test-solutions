package leetcode;

public class P2432 {
    public int hardestWorker(int n, int[][] logs) {
        int id = logs[0][0];
        int max = logs[0][1];
        int len = logs.length;
        for (int i = 1; i < len; i++) {
            int curr_val = logs[i][1] - logs[i - 1][1];
            if (curr_val > max) {
                max = curr_val;
                id = logs[i][0];
            } else if (curr_val == max) {
                int curr_id = logs[i][0];
                if (curr_id < id) {
                    id = curr_id;
                }
            }
        }
        return id;
    }
}
