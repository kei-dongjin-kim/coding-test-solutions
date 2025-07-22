package leetcode;

import java.util.Set;
import java.util.HashSet;

public class P1496 {
    public boolean isPathCrossing(String path) {
        Set<String> set1 = new HashSet<>();
        int x = 0;
        int y = 0;
        set1.add("0,0");
        for (char c : path.toCharArray()) {
            if (c == 'N') {
                y++;
            } else if (c == 'E') {
                x++;
            } else if (c == 'W') {
                x--;
            } else if (c == 'S') {
                y--;
            }
            String tmp = x + "," + y;
            if (set1.contains(tmp)) {
                return true;
            } else {
                set1.add(tmp);
            }
        }
        return false;
    }
}
