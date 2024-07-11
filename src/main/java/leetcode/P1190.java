package leetcode;

import java.util.Stack;

public class P1190 {
    public String reverseParentheses(String s) {
        int n = s.length();
        Stack<Integer> opi = new Stack<>();
        int[] pair = new int[n];

        for (int i=0 ; i<n ; i++) {
            if (s.charAt(i) == '(') {
                opi.push(i);
            }
            if (s.charAt(i) == ')') {
                int j = opi.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int curr=0, direction = 1 ; curr<n ; curr += direction) {
            if (s.charAt(curr) == '(' || s.charAt(curr) == ')') {
                curr = pair[curr];
                direction = -direction;
            } else {
                result.append(s.charAt(curr));
            }
        }

        return result.toString();
    }
}
