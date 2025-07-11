package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1592 {
    public String reorderSpaces(String text) {
        int count = 0;
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                count++;
                if (!sb.isEmpty()) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }
        if (!sb.isEmpty()) {
            list.add(sb.toString());
            sb.setLength(0);
        }
        int quotient = 0;
        int remainder = 0;
        if (list.size() < 2) {
            quotient = 0;
            remainder = count;
        } else {
            quotient = count / (list.size() - 1);
            remainder = count % (list.size() - 1);
        }
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                for (int j = 0; j < quotient; j++) {
                    sb.append(" ");
                }
            }
        }
        for (int j = 0; j < remainder; j++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
