package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                list.add(i);
            }
        }
        return list;
    }
}
