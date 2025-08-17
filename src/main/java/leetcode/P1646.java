package leetcode;

public class P1646 {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            int quotient = i / 2;
            int remainder = i % 2;
            arr[i] = arr[quotient];
            if (remainder == 1) {
                arr[i] += arr[quotient + 1];
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
