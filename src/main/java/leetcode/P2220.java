package leetcode;

public class P2220 {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        while (start > 0 || goal > 0) {
            int start_remainder = start % 2;
            int goal_remainder = goal % 2;
            if (start_remainder != goal_remainder) {
                count++;
            }
            start /= 2;
            goal /= 2;
        }
        return count;
    }
}
