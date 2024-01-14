package leetcode;

public class P0020 {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) return true;
        if (s.length() % 2 != 0) return false;
        char[] arr = s.toCharArray();
        char[] stack = new char[arr.length];
        int top = -1;
        for (char c : arr) {
            if (c == '(' || c == '[' || c == '{') {
                stack[++top] = c;
            } else if (c == ')' && top >= 0 && stack[top] == '(') {
                top--;
            } else if (c == ']' && top >= 0 && stack[top] == '[') {
                top--;
            } else if (c == '}' && top >= 0 && stack[top] == '{') {
                top--;
            } else {
                return false;
            }
        }
        return top == -1;
    }
}
