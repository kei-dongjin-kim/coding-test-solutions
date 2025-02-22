package leetcode;

import java.util.List;

public class P2859 {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int count = 0;
            int copied = i;
            while (copied > 0) {
                if (copied % 2 == 1) {
                    count++;
                }
                copied /= 2;
            }
            if (count == k) {
                sum += nums.get(i);
            }
        }
        return sum;
    }
}
