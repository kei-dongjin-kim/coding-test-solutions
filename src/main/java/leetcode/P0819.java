package leetcode;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class P0819 {
  public String mostCommonWord(String paragraph, String[] banned) {
    Map<String, Integer> map = new HashMap<>();
    for (String s : paragraph.split("[\\s!?',;.]+")) {
      String tmp = s.toLowerCase();
      if (!Arrays.asList(banned).contains(tmp)) {
        map.merge(tmp, 1, Integer::sum);
      }
    }
    int maxCount = 0;
    String maxWord = "";
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (maxCount < entry.getValue()) {
        maxCount = entry.getValue();
        maxWord = entry.getKey();
      }
    }
    return maxWord;
  }
}
