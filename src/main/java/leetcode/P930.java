package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int totalCount = 0;
        int currentSum = 0;

        // {prefix sum : number of occurrence}
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            currentSum += num;
            if (currentSum == goal) totalCount++;

            if (freq.containsKey(currentSum - goal))
                totalCount += freq.get(currentSum - goal);

            freq.put(currentSum, freq.getOrDefault(currentSum, 0) + 1);
        }

        return totalCount;
    }
}
