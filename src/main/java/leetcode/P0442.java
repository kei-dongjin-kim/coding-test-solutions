package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        boolean[] taken = new boolean[nums.length+1];
        for (int num : nums) {
            if (taken[num]) result.add(num);
            taken[num] = true;
        }
        return result;
    }
}
