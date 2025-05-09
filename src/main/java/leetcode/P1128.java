package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int[] arr : dominoes) {
            Arrays.sort(arr);
            String key = "" + arr[0] + arr[1];
            map.merge(key, 1, Integer::sum);
        }
        for (String key : map.keySet()) {
            int val = map.get(key);
            if (val > 1) {
                for (int i = val - 1; i > 0; i--) {
                    count += i;
                }
            }
        }
        return count;
    }
}
