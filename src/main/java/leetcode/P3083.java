package leetcode;

public class P3083 {
  public boolean isSubstringPresent(String s) {
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    for (int i = 0; i < s.length() - 1; i++) {
      if (sb.indexOf(s.substring(i, i + 2)) !=  -1) {
        return true;
      }
    }
    return false;
  }
}
