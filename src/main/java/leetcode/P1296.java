package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P1296 {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0) return false;

        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);

        while (!list.isEmpty()) {
            int curr = list.getFirst();
            for (int i=0 ; i<k ; i++) {
                int index = list.indexOf(curr + i);
                if (index == -1) return false;
                else list.remove(index);
            }
        }

        return true;
    }
}
