package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0078 {
    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<>();

        for (int i=0 ; i<(1 << len) ; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j=0 ; j<len ; j++) {
                if ((i & (1 << j)) > 0) {
                    sub.add(nums[j]);
                }
            }
            list.add(sub);
        }

        return list;
    }
}
