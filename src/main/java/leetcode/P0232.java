package leetcode;

import java.util.Stack;

public class P0232 {

    private Stack<Integer> s1, s2;
    int tmp = 0;

    public P0232() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        if (s1.isEmpty()) {
            tmp = x;
        }
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            return tmp;
        }
        return s2.peek();
    }

    public boolean empty() {
        return (s1.isEmpty() && s2.isEmpty());
    }

    public int[] print() {
        Stack<Integer> s1Copy = (Stack<Integer>) s1.clone();
        Stack<Integer> s2Copy = (Stack<Integer>) s2.clone();
        int[] result = new int[s1Copy.size() + s2Copy.size()];
        int i = 0;
        while (!s2Copy.isEmpty()) {
            result[i++] = s2Copy.pop();
        }
        while (!s1Copy.isEmpty()) {
            s2Copy.push(s1Copy.pop());
        }
        while (!s2Copy.isEmpty()) {
            result[i++] = s2Copy.pop();
        }
        return result;
    }
}
