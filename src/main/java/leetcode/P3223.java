package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P3223 {
    public int minimumLength(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        for (char c : map.keySet()) {
            int count = map.get(c);
            if (count >= 3) {
                if (count % 2 == 0) {
                    result += 2;
                } else {
                    result += 1;
                }
            } else {
                result += count;
            }
        }
        return result;
    }
}
