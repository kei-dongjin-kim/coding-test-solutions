package leetcode;

import java.util.List;
import java.util.ArrayList;

public class P3697 {
    public int[] decimalRepresentation(int n) {
        List<Integer> list = new ArrayList<>();
        int pow = 0;
        while (n > 0) {
            int rest = n % 10;
            if (rest > 0) {
                list.add(rest * (int) Math.pow(10, pow));
            }
            n /= 10;
            pow++;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(list.size() - i - 1);
        }
        return res;
    }
}
