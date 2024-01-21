package leetcode;

import java.util.Stack;

public class P0907 {
    public int sumSubarrayMins(int[] arr) {

        int len = arr.length;
        Stack<Integer> stack = new Stack<>();
        long result = 0L;
        // The constant MOD is used as the modulus for the modulo operation in the algorithm.
        final int MOD = 1_000_000_007;

        for(int i=0 ; i<=len ; i++) {
            while(!stack.empty() && (i == len || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int next = i;
                int prev = stack.empty() ? -1 : stack.peek();
                // count = (next - mid) * (mid - prev)
                long count = (long) (next - mid) * (mid - prev) % MOD;
                result += arr[mid] * count;
                result %= MOD;
            }
            stack.push(i);
        }
        return (int)result % MOD;
    }
}
