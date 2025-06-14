package leetcode;

public class P2379 {
    public int minimumRecolors(String blocks, int k) {
        int min = k;
        int len = blocks.length();
        for (int i = 0; i < len - k + 1; i++) {
            int curr = 0;
            for (int j = 0; j < k; j++) {
                if (blocks.charAt(i + j) == 'W') {
                    curr++;
                }
            }
            min = Math.min(min, curr);
        }
        return min;
    }
}
