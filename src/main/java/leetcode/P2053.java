package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P2053 {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            map.merge(s, 1, Integer::sum);
        }
        int count = 0;
        for (String s : arr) {
            if (map.get(s) == 1) {
                count++;
                if (count == k) {
                    return s;
                }
            }
        }
        return "";
    }
}
