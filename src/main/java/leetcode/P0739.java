package leetcode;

import java.util.Stack;

public class P0739 {

    // The solution uses a Stack data structure and traverses the temperature array in reverse order.
    // (Specifically, Monotonic Stack)
    // The Stack is used to keep track of the indices of the temperatures.
    public int[] dailyTemperatures(int[] temperatures) {

        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i=temperatures.length-1 ; i>=0 ; i--) {
            if (stack.isEmpty()) {
                ans[i] = 0;
            } else {
                //  If the stack is not empty,
                //  it pops elements (indices) from the stack
                //  as long as the current temperature is greater than or equal to the temperature
                //  at the top of the stack.
                //  This is because we are looking for the next day with a higher temperature.
                while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ans[i] = 0;
                } else {
                    ans[i] = stack.peek() - i;
                }
            }
            stack.push(i);
        }

        return ans;
    }
}
