package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0884 {
  public String[] uncommonFromSentences(String s1, String s2) {
    List<String> list = new ArrayList<>();
    Map<String, Integer> map1 = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();
    for (String s : s1.split(" ")) {
      map1.merge(s, 1, Integer::sum);
    }
    for (String s : s2.split(" ")) {
      map2.merge(s, 1, Integer::sum);
    }
    for (String s : map1.keySet()) {
      if (map1.get(s) == 1 && !map2.containsKey(s)) {
        list.add(s);
      }
    }
    for (String s : map2.keySet()) {
      if (map2.get(s) == 1 && !map1.containsKey(s)) {
        list.add(s);
      }
    }
    return list.toArray(new String[0]);
  }
}
