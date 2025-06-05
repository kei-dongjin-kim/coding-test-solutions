package leetcode;

public class P1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] line = new boolean[51];
        for (int[] r : ranges) {
            for (int i = r[0]; i <= r[1]; i++) {
                line[i] = true;
            }
        }
        for (int i = left; i <= right; i++) {
            if (!line[i]) {
                return false;
            }
        }
        return true;
    }
}
