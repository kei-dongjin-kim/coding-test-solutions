package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1078 {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] splited = text.split(" ");
        int len = splited.length;
        for (int i = 0; i < len - 2; i++) {
            if (
                    first.equals(splited[i]) &&
                            second.equals(splited[i + 1])
            ) {
                list.add(splited[i + 2]);
            }
        }
        return list.toArray(new String[0]);
    }
}
