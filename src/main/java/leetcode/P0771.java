package leetcode;

import java.util.Map;
import java.util.HashMap;

public class P0771 {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : jewels.toCharArray()) {
            map.put(c, 1); // no need to count
        }
        for (char c : stones.toCharArray()) {
            count += map.getOrDefault(c, 0);
        }
        return count;
    }
}
