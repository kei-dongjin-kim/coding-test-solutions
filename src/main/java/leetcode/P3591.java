package leetcode;

import java.util.Map;
import java.util.HashMap;

public class P3591 {
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            if (isPrime(val)) {
                return true;
            }
        }
        return false;
    }

    private boolean isPrime(int val) {
        if (val < 2) {
            return false;
        }
        for (int i = 2; i < val; i++) {
            if (val % i == 0) {
                return false;
            }
        }
        return true;
    }
}
