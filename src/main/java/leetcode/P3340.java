package leetcode;

public class P3340 {
  public boolean isBalanced(String num) {
    int result = 0;
    int i = 0;
    for (char c : num.toCharArray()) {
      int curr = c - '0';
      if (i % 2 == 0) {
        result += curr;
      } else {
        result -= curr;
      }
      i++;
    }
    return result == 0;
  }
}
