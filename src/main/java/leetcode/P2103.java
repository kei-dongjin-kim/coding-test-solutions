package leetcode;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class P2103 {
    public int countPoints(String rings) {
        Map<Character, Set<Character>> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < rings.length(); i += 2) {
            char key = rings.charAt(i + 1);
            char val = rings.charAt(i);
            if (map.containsKey(key)) {
                map.get(key).add(val);
            } else {
                Set<Character> set = new HashSet<>();
                set.add(val);
                map.put(key, set);
            }
        }
        for (Character key : map.keySet()) {
            if (map.get(key).size() == 3) {
                count++;
            }
        }
        return count;
    }
}
