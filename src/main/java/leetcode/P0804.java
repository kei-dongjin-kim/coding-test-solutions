package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P0804 {
  public int uniqueMorseRepresentations(String[] words) {
    String[] codeArr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    Set<String> codeSet = new HashSet<>();
    for (String s : words) {
      StringBuilder sb = new StringBuilder();
      for (char c : s.toCharArray()) {
        sb.append(codeArr[c - 'a']);
      }
      codeSet.add(sb.toString());
    }
    return codeSet.size();
  }
}
