package leetcode;

public class P1304 {
    public int[] sumZero(int n) {
        boolean even = n % 2 == 0;
        int start = - (n / 2);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (start + i == 0 && even) {
                start++;
            }
            result[i] = start + i;
        }
        return result;
    }
}
