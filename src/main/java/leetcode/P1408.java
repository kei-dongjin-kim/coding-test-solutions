package leetcode;

import java.util.List;
import java.util.ArrayList;

public class P1408 {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        int len = words.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len ; j++) {
                if (i != j) {
                    if (words[j].contains(words[i])) {
                        list.add(words[i]);
                        break;
                    }
                }
            }
        }
        return list;
    }
}
