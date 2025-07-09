package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P0575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set1 = new HashSet<>();
        for (int i : candyType) {
            set1.add(i);
        }
        return Math.min(candyType.length / 2, set1.size());
    }
}
