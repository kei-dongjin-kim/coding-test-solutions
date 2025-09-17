package leetcode;

public class P2180 {
    public int countEven(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            int curr = i;
            int sum = 0;
            while (curr > 0) {
                sum += curr % 10;
                curr /= 10;
            }
            if (sum % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
