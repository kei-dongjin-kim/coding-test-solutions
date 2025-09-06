package leetcode;

import java.util.List;
import java.util.ArrayList;

public class P2164 {
    public int[] sortEvenOdd(int[] nums) {
        int len = nums.length;
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }
        even.sort((a, b) -> a.compareTo(b));
        odd.sort((a, b) -> b.compareTo(a));
        int even_i = 0;
        int odd_i = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 == 0) {
                nums[i] = even.get(even_i++);
            } else {
                nums[i] = odd.get(odd_i++);
            }
        }
        return nums;
    }
}
