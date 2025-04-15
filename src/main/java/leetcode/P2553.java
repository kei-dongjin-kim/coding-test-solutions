package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P2553 {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int n = nums[i];
            while (n > 0) {
                list.add(n % 10);
                n /= 10;
            }
        }
        int idx = 0;
        int sz = list.size();
        int[] ans = new int[sz];
        for (int i = sz - 1; i >= 0; i--) {
            ans[idx] = list.get(i);
            idx++;
        }
        return ans;
    }
}
