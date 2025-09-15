package leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class P2248 {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int[] n : nums) {
            for (int i : n) {
                map.merge(i, 1, Integer::sum);
            }
        }
        for (Integer key : map.keySet()) {
            if (nums.length == map.get(key)) {
                list.add(key);
            }
        }
        list.sort((a, b) -> a - b);
        return list;
    }
}
