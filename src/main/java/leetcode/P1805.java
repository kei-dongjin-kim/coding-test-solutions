package leetcode;

import java.util.Set;
import java.util.HashSet;

public class P1805 {
    public int numDifferentIntegers(String word) {
        Set<String> set1 = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char curr = word.charAt(i);
            if (Character.isDigit(curr)) {
                if ("0".contentEquals(sb)) {
                    sb.setLength(0);
                }
                sb.append(curr);
            } else {
                if (!sb.isEmpty()) {
                    set1.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if (!sb.isEmpty()) {
            set1.add(sb.toString());
        }
        return set1.size();
    }
}
