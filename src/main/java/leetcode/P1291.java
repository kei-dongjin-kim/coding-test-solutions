package leetcode;

import java.util.List;
import java.util.ArrayList;

public class P1291 {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        int len_low = String.valueOf(low).length();
        int len_high = String.valueOf(high).length();
        while (len_low <= len_high) {
            for (int i = 1; i < 10 - len_low + 1; i++) {
                int p_num = 0;
                int turn = 0;
                while (turn < len_low) {
                    p_num += (int)((i + turn) * Math.pow(10, len_low - 1 -turn));
                    turn++;
                }
                if (low <= p_num && p_num <= high) {
                    list.add(p_num);
                }
            }
            len_low++;
        }
        return list;
    }
}
