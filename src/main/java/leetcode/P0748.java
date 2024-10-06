package leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class P0748 {
  public String shortestCompletingWord(String licensePlate, String[] words) {
    int[] map = new int[26];
    for (char c : licensePlate.toCharArray()) {
      if (Character.isLetter(c)) {
        map[Character.toLowerCase(c) - 'a']++;
      }
    }
    List<String> list = new ArrayList<>();
    for (int i=0 ; i<words.length ; i++) {
      int[] tmp = new int[26];
      for (char c : words[i].toCharArray()) {
        if (Character.isLetter(c)) {
          tmp[Character.toLowerCase(c) - 'a']++;
        }
      }
      boolean flag = true;
      for (int j=0 ; j<26 ; j++) {
        if (tmp[j] < map[j]) {
          flag = false;
        }
      }
      if (flag) {
        list.add(words[i]);
      }
    }
    Collections.sort(list, (a, b)-> a.length() - b.length());
    return list.get(0);
  }
}
