package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1002 {
    public List<String> commonChars(String[] words) {
        int len = words.length;
        List<String> list = new ArrayList<>();
        int[][] arr = new int[len][26];
        for (int i=0 ; i<len ; i++) {
            for (char c : words[i].toCharArray()) {
                arr[i][c - 'a'] += 1;
            }
        }
        for (int i=0 ; i<26 ; i++) {
            int min = Integer.MAX_VALUE;
            for (int j=0 ; j<len ; j++) {
                if (arr[j][i] == 0) {
                    min = 0;
                    break;
                }
                min = Math.min(min, arr[j][i]);
            }
            while (min > 0) {
                list.add(Character.toString((char) i + 'a'));
                min--;
            }
        }
        return list;
    }
}
