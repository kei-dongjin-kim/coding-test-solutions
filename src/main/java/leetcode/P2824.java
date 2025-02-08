package leetcode;

import java.util.List;

public class P2824 {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int len = nums.size();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }
}
