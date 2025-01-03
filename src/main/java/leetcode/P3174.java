package leetcode;

public class P3174 {
  public String clearDigits(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      if ('0' <= c && c <= '9') {
        int len = sb.length() - 1 == 0 ? 0 : sb.length() - 1;
        sb.setLength(len);
      } else {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}
