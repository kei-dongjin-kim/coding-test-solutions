package leetcode;

public class P2511 {
    public int captureForts(int[] forts) {
        int max = 0;
        int curr = 0;
        int len = forts.length;
        for (int i = 0; i < len; i++) {
            if (forts[i] == 1) {
                if (
                        curr != 0 &&
                                i - curr > 0 &&
                                forts[i - curr - 1] == -1
                ) {
                    max = Math.max(max, curr);
                }
                curr = 0;
            } else if (forts[i] == -1) {
                if (
                        curr != 0 &&
                                i - curr > 0 &&
                                forts[i - curr - 1] == 1
                ) {
                    max = Math.max(max, curr);
                }
                curr = 0;
            } else {
                curr++;
            }
        }
        return max;
    }
}
