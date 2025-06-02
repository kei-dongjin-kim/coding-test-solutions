package leetcode;

public class P1629 {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int len = releaseTimes.length;
        int max = releaseTimes[0];
        char ans = 'a';
        for (int i = len -1; i > 0; i--) {
            releaseTimes[i] -= releaseTimes[i - 1];
            max = Math.max(max, releaseTimes[i]);
        }
        for (int i = 0; i < len; i++) {
            if (releaseTimes[i] == max) {
                char curr = keysPressed.charAt(i);
                if (ans < curr) {
                    ans = curr;
                }
            }
        }
        return ans;
    }
}
