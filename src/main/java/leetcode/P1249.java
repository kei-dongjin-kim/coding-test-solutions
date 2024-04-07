package leetcode;

import java.util.Stack;

public class P1249 {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        int i = 0;
        while (i<sb.length()) {
            char curr = sb.charAt(i);
            if (stack.empty() && curr == ')') {
                sb.delete(i, i+1);
                continue;
            } else if (curr == '(') {
                stack.push(i);
            } else if (curr == ')') {
                stack.pop();
            }
            i++;
        }
        while(!stack.empty()) {
            int d = stack.pop();
            sb.delete(d, d+1);
        }

        return sb.toString();
    }
}
