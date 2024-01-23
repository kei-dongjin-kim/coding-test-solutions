package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class P0645 {
    public int[] findErrorNums(int[] nums) {

        int[] numOccurrences = new int[nums.length];
        int duplicateNum = 0;

        // If nums.length = n, sum of all number is n(n+1)/2
        int missingNum = nums.length * (nums.length + 1) / 2;

        for (int num : nums) {
            if (numOccurrences[num -1] == 1) duplicateNum = num;
            else missingNum -= num;
            numOccurrences[num - 1]++;
        }

        return new int[] {duplicateNum, missingNum};
    }
}
