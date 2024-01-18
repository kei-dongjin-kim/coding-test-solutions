package leetcode;

import java.util.HashMap;
import java.util.HashSet;
public class P1207 {

    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            int count = map.getOrDefault(j, 0);
            map.put(j, count + 1);
        }

        HashSet<Integer> set = new HashSet<>();
        for (Integer value : map.values()) {
            if (set.contains(value)) return false;
            set.add(value);
        }

        return true;
    }
}
