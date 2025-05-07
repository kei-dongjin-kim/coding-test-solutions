package leetcode;

import java.util.Arrays;

public class P1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int curr = 1;
        while (candies > 0) {
            int index = (curr - 1) % num_people;
            if (candies - curr < 0) {
                result[index] += candies;
                break;
            } else {
                result[index] += curr;
            }
            candies -= curr;
            curr++;
        }
        return result;
    }
}
