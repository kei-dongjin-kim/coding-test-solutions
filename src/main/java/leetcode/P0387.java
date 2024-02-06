package leetcode;

import java.util.HashMap;

public class P0387 {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i=0 ; i<s.length() ; i++) {
            if (map.getOrDefault(s.charAt(i), 0) == 1) {
                return i;
            }
        }
        return -1;
    }
}
