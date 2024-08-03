package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1460 {
    public boolean canBeEqual(int[] target, int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.merge(num, 1, Integer::sum);
        }
        for (int num : target) {
            if (!map.containsKey(num)) {
                return false;
            }

            map.merge(num, -1, Integer::sum);
            if (map.get(num) == 0) {
                map.remove(num);
            }
        }
        return map.isEmpty();


        // Arrays.sort(target);
        // Arrays.sort(arr);
        // for (int i=0 ; i<arr.length ; i++) {
        //     if (target[i] != arr[i]) {
        //         return false;
        //     }
        // }
        // return true;
    }
}
