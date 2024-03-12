package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0791 {
    public String customSortString(String order, String s) {
        char[] result = new char[s.length()];
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) list.add(c);
        int index = 0;
        for (char c : order.toCharArray()) {
            while (list.contains(c)) {
                int found = list.indexOf(c);
                result[index++] = list.remove(found);
            }
        }
        while (!list.isEmpty()) {
            result[index++] = list.removeFirst();
        }
        return new String(result);
    }
}
