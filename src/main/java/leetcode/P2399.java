package leetcode;

import java.util.Arrays;

public class P2399 {
    public boolean checkDistances(String s, int[] distance) {
        int[] map = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (map[index] == 0) {
                map[index] = - i - 1;
            } else {
                if (map[index] + i != distance[index]) {
                    return false;
                }
            }
        }
        return true;
    }
}
