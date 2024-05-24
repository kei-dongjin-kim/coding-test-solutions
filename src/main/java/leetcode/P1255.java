package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1255 {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int max = 0;
        int len = words.length;
        for (int i=0 ; i<(1<<len) ; i++) {
            List<String> subset = new ArrayList<>();
            for (int j=0 ; j<len ; j++) {
                if ((i & (1<<j)) > 0) {
                    subset.add(words[j]);
                }
            }
            int sub = scoreSubset(subset, letters, score);
            max = Math.max(max, sub);
        }
        return max;
    }
    public int scoreSubset(List<String> words, char[] letters, int[] score) {
        int sum = 0;
        List<Integer> visited = new ArrayList<>();
        for (int i=0 ; i<words.size() ; i++) {
            int sub = 0;
            for (char c : words.get(i).toCharArray()) {
                int found = -1;
                for (int j=0 ; j<letters.length ; j++) {
                    if (c == letters[j] && !visited.contains(j)) {
                        found = j;
                    }
                }
                if (found != -1) {
                    visited.add(found);
                    sub += score[letters[found] - 'a'];
                } else {
                    sub = 0;
                    break;
                }
            }
            sum += sub;
        }
        return sum;
    }
}
