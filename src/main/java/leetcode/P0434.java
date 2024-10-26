package leetcode;

public class P0434 {
  public int countSegments(String s) {
    int count = 0;
    boolean flag = false;
    for (char c : s.toCharArray()) {
      if (c == ' ') {
        flag = false;
      } else {
        if (!flag) {
          count++;
        }
        flag = true;
      }
    }
    return count;
  }
}
