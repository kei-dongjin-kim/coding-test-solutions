package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class P2506 {
    public int similarPairs(String[] words) {
        List<Set<Character>> list = new ArrayList<>();
        for (String s : words) {
            Set<Character> set1 = new HashSet<>();
            for (char c : s.toCharArray()) {
                set1.add(c);
            }
            list.add(set1);
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                Set seti = list.get(i);
                Set setj = list.get(j);
                if (seti.equals(setj)) {
                    count++;
                }
            }
        }
        return count;
    }
}
