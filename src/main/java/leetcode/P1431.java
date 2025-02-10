package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for(int i : candies) {
            max = Math.max(max, i);
        }
        List<Boolean> list = new ArrayList<>();
        for (int i : candies) {
            list.add(i + extraCandies >= max);
        }
        return list;
    }
}
