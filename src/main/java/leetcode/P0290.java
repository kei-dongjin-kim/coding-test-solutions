package leetcode;

import java.util.*;

public class P0290 {
  public boolean wordPattern(String pattern, String s) {
    String[] sArr = s.split(" ");
    if (sArr.length != pattern.length()) {
      return false;
    }
    Map<Character, String> map = new HashMap<>();
    for (int i=0 ; i<pattern.length() ; i++) {
      char current = pattern.charAt(i);
      if (map.containsKey(current)) {
        String matching = map.get(pattern.charAt(i));
        if (!matching.equals(sArr[i])) {
          return false;
        }
      } else {
        if (map.containsValue(sArr[i])) {
          return false;
        } else {
          map.put(current, sArr[i]);
        }
      }
    }
    return true;
  }
}
