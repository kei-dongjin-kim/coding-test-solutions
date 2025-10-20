package leetcode;

public class P3498 {
    public int reverseDegree(String s) {
        int res = 0;
        int index = 1;
        for (char c : s.toCharArray()) {
            int val = c - 'a';
            res += (26 - val) * index;
            index++;
        }
        return res;
    }
}
