package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P2423 {
    public boolean equalFrequency(String word) {
        int[] freqs = new int[26];
        for (char c : word.toCharArray()) freqs[c - 'a']++;

        Map<Integer, Integer> map = new HashMap<>();
        for (int f : freqs) {
            if (f != 0) {
                map.put(f, map.getOrDefault(f, 0) + 1);
            }
        }

        if (map.isEmpty()) return true;
        else if (map.size() == 1) {
            // It's true, if freq is 1.
            if (map.containsKey(1)) return true;
            else return false;
        } else if (map.size() == 2) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int key : map.keySet()) {
                min = Math.min(min, key);
                max = Math.max(max, key);
            }
            if (max - min != 1) return false;
            if (map.get(min) != 1 && map.get(max) != 1) return false;
        } else {
            // It's false, if kind of freq is more than 2.
            return false;
        }
        return true;
    }
}
