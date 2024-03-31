package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P0992 {
    public int subarraysWithKDistinct(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int left = 0;
        int right = 0;
        int currCount = 0;
        int totalCount = 0;

        while(right < len){
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while(map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
                currCount = 0;
            }

            while(map.size() == k && map.get(nums[left]) > 1) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
                currCount++;
            }

            if(map.size() == k) {
                totalCount += currCount + 1;
            }

            right++;
        }

        return totalCount;
    }
}
