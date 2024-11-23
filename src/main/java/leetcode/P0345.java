package leetcode;

import java.util.Stack;

public class P0345 {
  public String reverseVowels(String s) {
    StringBuilder sb = new StringBuilder();
    String vowels = "AaEeIiOoUu";
    Stack<Character> stack = new Stack<>();
    for (int i=0 ; i<s.length() ; i++) {
      char c = s.charAt(i);
      if (vowels.indexOf(c) > -1) {
        stack.push(c);
      }
    }
    for (int i=0 ; i<s.length() ; i++) {
      if (vowels.indexOf(s.charAt(i)) > -1) {
        sb.append(stack.pop());
      } else {
        sb.append(s.charAt(i));
      }
    }
    return sb.toString();
  }
}
