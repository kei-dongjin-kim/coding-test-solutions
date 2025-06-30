package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Pair {
    int val;
    int bin;

    Pair (int val, int bin) {
        this.val = val;
        this.bin = bin;
    }
}
public class P1356 {
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        List<Pair> list = new ArrayList<>();
        for (int val : arr) {
            int curr = val;
            int bin = 0;
            while (curr > 0) {
                if (curr % 2 == 1) {
                    bin++;
                }
                curr /= 2;
            }
            list.add(new Pair(val, bin));
        }
        list.sort(Comparator.comparingInt((Pair p) -> p.bin).thenComparingInt(p -> p.val));
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = list.get(i).val;
        }
        return ans;
    }
}