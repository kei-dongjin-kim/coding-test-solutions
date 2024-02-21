package leetcode;

import java.util.Arrays;

public class P2335 {
    public int fillCups(int[] amount) {
        int second = 0;
        while (amount[0] > 0 || amount[1] > 0 || amount[2] > 0) {
            Arrays.sort(amount);
            if (amount[2] > 0) amount[2]--;
            if (amount[1] > 0) amount[1]--;
            second++;
        }
        return second;
    }
}
