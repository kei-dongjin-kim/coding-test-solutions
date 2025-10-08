package leetcode;

import java.util.List;

public class P2913 {
    public int sumCounts(List<Integer> nums) {
        // int sum = 0;
        // for (int i = 0; i < nums.size(); i++) {
        //     for (int j = i; j < nums.size(); j++) {
        //         Set<Integer> set1 = new HashSet<>();
        //         for (int k = i; k <= j; k++) {
        //             set1.add(nums.get(k));
        //         }
        //         sum += set1.size() * set1.size();
        //     }
        // }
        // return sum;

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            int[] map = new int[101];
            int distinctCount = 0;
            for (int j = i; j < nums.size(); j++) {
                if (map[nums.get(j)] == 0) {
                    distinctCount++;
                }
                sum += distinctCount * distinctCount;
                map[nums.get(j)]++;
            }
        }
        return sum;
    }
}
