package leetcode;

public class P0557 {
  public String reverseWords(String s) {
    StringBuilder result = new StringBuilder();
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (c == ' ') {
        result.append(sb.reverse());
        result.append(' ');
        sb.setLength(0);
      } else {
        sb.append(c);
      }
    }
    result.append(sb.reverse());
    return result.toString();
  }
}
