package leetcode;

import java.util.Stack;
public class P0150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Integer value1, value2;

        for (String token : tokens) {
            switch (token) {
                case "+" -> {
                    value1 = stack.pop();
                    value2 = stack.pop();
                    stack.push(value1 + value2);
                }
                case "-" -> {
                    value1 = stack.pop();
                    value2 = stack.pop();
                    stack.push(value2 - value1);
                }
                case "*" -> {
                    value1 = stack.pop();
                    value2 = stack.pop();
                    stack.push(value1 * value2);
                }
                case "/" -> {
                    value1 = stack.pop();
                    value2 = stack.pop();
                    stack.push(value2 / value1);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}
