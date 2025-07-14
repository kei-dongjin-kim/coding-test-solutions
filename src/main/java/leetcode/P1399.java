package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1399 {
    public int countLargestGroup(int n) {
        int count = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int curr = i;
            int sum = 0;
            while (curr > 0) {
                sum += (curr % 10);
                curr /= 10;
            }
            map.merge(sum, 1, Integer::sum);
        }
        for (Integer key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        for (Integer key : map.keySet()) {
            if (max == map.get(key)) {
                count++;
            }
        }
        return count;
    }
}
