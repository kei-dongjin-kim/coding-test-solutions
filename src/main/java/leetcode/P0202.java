package leetcode;

public class P0202 {
    public boolean isHappy(int n) {
        // Floyd's cycle detection algorithm
        int slow = n;
        int fast = getNext(n);
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            n /= 10;
            sum += d * d;
        }
        return sum;
    }
}
