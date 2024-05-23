package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P2597 {
    public int beautifulSubsets(int[] nums, int k) {
        int len = nums.length;
        int count = 0;

        for (int i=0 ; i<(1<<len) ; i++) {
            List<Integer> list = new ArrayList<>();
            boolean isButiful = true;
            for (int j=0 ; j<len ; j++) {
                if ((i & (1<<j)) > 0) {
                    for (int x=0 ; x<list.size() ; x++) {
                        if (Math.abs(list.get(x) - nums[j]) == k) {
                            isButiful = false;
                            break;
                        }
                    }
                    if (isButiful) {
                        list.add(nums[j]);
                    } else {
                        break;
                    }
                }
            }
            if (!list.isEmpty() && isButiful) {
                count++;
            }
        }
        return count;
    }
}
