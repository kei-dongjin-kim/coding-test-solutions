package leetcode;

import java.util.Arrays;
import java.util.Collections;

public class P3075 {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        // reverse
        for (int i=0 ; i<happiness.length/2 ; i++) {
            int temp = happiness[i];
            happiness[i] = happiness[happiness.length-1-i];
            happiness[happiness.length-1-i] = temp;
        }
        long sum = 0;
        for (int i=0 ; i<k ; i++) {
            long tmp = Math.max((happiness[i] - i), 0);
            sum += tmp;
        }
        return sum;
    }

}
