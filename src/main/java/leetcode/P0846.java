package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0846 {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int len = hand.length;
        if (len % groupSize != 0) return false;

        Arrays.sort(hand);
        List<Integer> list = new ArrayList<>();
        for (int h : hand) list.add(h);

        while (!list.isEmpty()) {
            int curr = list.getFirst();
            for (int i=0 ; i<groupSize ; i++) {
                int index = list.indexOf(curr + i);
                if (index == -1) return false;
                else list.remove(index);
            }
        }
        return true;
    }
}
