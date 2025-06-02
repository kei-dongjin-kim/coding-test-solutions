package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P2094 {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int[] map = new int[10];
        for (int d : digits) {
            map[d]++;
        }
        for (int i = 100; i < 1000; i++) {
            int[] tmp = new int[10];
            System.arraycopy(map, 0, tmp, 0, 10);
            int curr = i;
            boolean flag = true;
            while (curr > 0) {
                int rest = curr % 10;
                tmp[rest]--;
                if (tmp[rest] < 0) {
                    flag = false;
                    break;
                }
                curr /= 10;
            }
            if (flag && i % 2 == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
