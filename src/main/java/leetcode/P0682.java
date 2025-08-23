package leetcode;

import java.util.Stack;

public class P0682 {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String op : operations) {
            if ("+".equals(op)) {
                int p = st.pop();
                int pp = st.peek();
                st.push(p);
                st.push(p + pp);
            } else if ("D".equals(op)) {
                int sub = st.peek();
                st.push(sub * 2);
            } else if ("C".equals(op)) {
                st.pop();
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        int score = 0;
        while (!st.isEmpty()) {
            score += st.pop();
        }
        return score;
    }
}
