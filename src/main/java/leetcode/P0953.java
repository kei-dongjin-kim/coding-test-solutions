package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P0953 {
  public boolean isAlienSorted(String[] words, String order) {
    int len = words.length;
    if (len <= 1) {
      return true;
    }
    Map<Character, Integer> map = new HashMap<>();
    for (int i=0 ; i<order.length() ; i++) {
      map.put(order.charAt(i), i);
    }
    for (int i=1 ; i<len ; i++) {
      String previous = words[i - 1];
      String current = words[i];
      int min = Math.min(previous.length(), current.length());
      for (int j=0 ; j<min ; j++) {
        int left = map.get(previous.charAt(j));
        int right = map.get(current.charAt(j));
        if (left < right) {
          break;
        } else if (left == right) {
          if (j == min - 1 && previous.length() > current.length()) {
            return false;
          }
          continue;
        } else {
          return false;
        }
      }
    }
    return true;
  }
}
