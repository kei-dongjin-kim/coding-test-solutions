package leetcode;

public class P1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int max = 0;
        int curr = 0;
        int len = customers.length;
        for (int i=0 ; i<len ; i++) {
            if (i < minutes) {
                curr += customers[i];
            } else {
                curr += grumpy[i] == 0 ? customers[i] : 0;
            }
        }
        max = curr;
        if (len == minutes) return max;
        for (int i=0 ; i<len - minutes ; i++) {
            curr += grumpy[i] == 0 ? customers[i] : 0;
            curr -= grumpy[i + minutes] == 0 ? customers[i + minutes] : 0;
            curr += customers[i + minutes];
            curr -= customers[i];
            max = Math.max(max, curr);
        }
        return max;
    }
}
