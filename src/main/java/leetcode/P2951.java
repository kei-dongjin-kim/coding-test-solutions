package leetcode;

import java.util.List;
import java.util.ArrayList;

public class P2951 {
    public List<Integer> findPeaks(int[] mountain) {
        int len = mountain.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < len - 1; i++) {
            if (
                mountain[i - 1] < mountain[i] &&
                mountain[i + 1] < mountain[i]
            ) {
                list.add(i);
            }
        }
        return list;
    }
}
