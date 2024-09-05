package leetcode;

public class P2028 {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum1 = 0;
        for (int i : rolls) {
            sum1 += i;
        }
        int sum2 = ((rolls.length + n) * mean) - sum1;
        if (sum2 < n || n * 6 < sum2) {
            return new int[]{};
        }
        int[] result = new int[n];
        int baseValue = sum2 / n;
        int remainder = sum2 % n;
        for (int i = 0; i < n; i++) {
            result[i] = baseValue + (i < remainder ? 1 : 0);
        }
        return result;
    }
}
