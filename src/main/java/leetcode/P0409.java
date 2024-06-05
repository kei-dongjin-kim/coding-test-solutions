package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P0409 {
    public int longestPalindrome(String s) {
        int sum = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            int curr = map.getOrDefault(c, 0);
            if (curr == 0) {
                map.put(c, 1);
            } else {
                sum += 2;
                map.remove(c);
            }
        }
        if (map.size() > 0) sum += 1;
        return sum;
    }
}
