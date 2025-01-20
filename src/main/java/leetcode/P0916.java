package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0916 {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();
        if (words1 == null || words1.length == 0) {
            return list;
        }
        if (words2 == null || words2.length == 0) {
            return list;
        }
        List<int[]> w1 = new ArrayList<>();
        List<int[]> w2 = new ArrayList<>();
        for (String s1 : words1) {
            int[] map = new int[26];
            for (char c : s1.toCharArray()) {
                map[c - 'a']++;
            }
            w1.add(map);
        }
        for (String s2 : words2) {
            int[] map = new int[26];
            for (char c : s2.toCharArray()) {
                map[c - 'a']++;
            }
            w2.add(map);
        }
        for (int j = 0; j < w1.size(); j++) {
            boolean flag = true;
            for (int[] map2 : w2) {
                for (int i = 0; i < 26; i++) {
                    if (w1.get(j)[i] - map2[i] < 0) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                list.add(words1[j]);
            }
        }
        return list;
    }
}
