package leetcode;

public class P2696 {
  public int minLength(String s) {
    StringBuilder sb = new StringBuilder(s);
    String[] patterns = {"AB", "CD"};
    while (true) {
      boolean deleted = false;
      for (String pattern : patterns) {
        int index = sb.indexOf(pattern);
        if (index != -1) {
          sb.delete(index, index + 2);
          deleted = true;
          break;
        }
      }
      if (!deleted) break;
    }
    return sb.length();
  }
}
