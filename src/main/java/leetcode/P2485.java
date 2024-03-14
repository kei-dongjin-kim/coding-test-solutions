package leetcode;

public class P2485 {
    public int pivotInteger(int n) {
        int left = 1;
        int right = n;
        int left_sum = 1;
        int right_sum = n;
        while (left <= right) {
            if (left == right && left_sum == right_sum) {
                return left;
            } else if (left_sum <= right_sum) {
                left_sum += ++left;
            } else {
                right_sum += --right;
            }
        }
        return -1;
    }
}
