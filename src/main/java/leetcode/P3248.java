package leetcode;

import java.util.List;

public class P3248 {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i = 0;
        int j = 0;
        for (String s : commands) {
            if ("UP".equals(s)) {
                i--;
            } else if ("RIGHT".equals(s)) {
                j++;
            } else if ("DOWN".equals(s)) {
                i++;
            } else if ("LEFT".equals(s)) {
                j--;
            }
        }
        return (i * n) + j;
    }
}
