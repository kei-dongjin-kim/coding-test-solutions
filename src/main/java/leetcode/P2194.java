package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P2194 {
    public List<String> cellsInRange(String s) {
        List<String> list = new ArrayList<>();
        int col_from = (int) s.charAt(0);
        int row_from = (int) s.charAt(1) - '0';
        int col_to = (int) s.charAt(3);
        int row_to = (int) s.charAt(4) - '0';
        for (int i = col_from; i <= col_to; i++) {
            for (int j = row_from; j <= row_to; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append((char) i);
                sb.append(j);
                list.add(sb.toString());
            }
        }
        return list;
    }
}
