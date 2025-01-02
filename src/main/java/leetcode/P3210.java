package leetcode;

public class P3210 {
  public String getEncryptedString(String s, int k) {
    StringBuilder sb = new StringBuilder();
    int len = s.length();
    for (int i = 0; i < len; i++) {
      char curr = s.charAt((i + k) % len);
      sb.append(curr);
    }
    return sb.toString();
  }
}
