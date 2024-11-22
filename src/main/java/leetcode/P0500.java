package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0500 {
  public String[] findWords(String[] words) {
    String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
    List<String> list = new ArrayList<>();
    for (String w : words) {
      for (String r : rows) {
        boolean flag = true;
        for (int i=0 ; i<w.length() ; i++) {
          if (r.indexOf(Character.toLowerCase(w.charAt(i))) == -1) {
            flag = false;
            break;
          }
        }
        if (flag) {
          list.add(w);
          break;
        }
      }
    }
    return list.toArray(new String[0]);
  }
}
