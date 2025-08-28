package leetcode;

public class P1716 {
    public int totalMoney(int n) {
        int sum = 0;
        int week = 1;
        int monday = 1;
        for (int i = 1; i <= n; i++) {
            sum += monday++;
            if (i % 7 == 0) {
                monday = ++week;
            }
        }
        return sum;
    }
}
