package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1287 {
    public int findSpecialInteger(int[] arr) {
        int q = arr.length / 4;
        System.out.println(q);
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : arr) {
            map.merge(a, 1, Integer::sum);
            if (map.get(a) > q) {
                return a;
            }
        }
        return -1;
    }
}
