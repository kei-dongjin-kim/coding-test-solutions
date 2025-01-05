package leetcode;

public class P3178 {
  public int numberOfChild(int n, int k) {
    int index = 0;
    int direction = 1;
    for (int i = 1; i <= k; i++) {
      if (index == 0 && direction == -1) {
        direction = 1;
      } else if (index == n - 1 && direction == 1) {
        direction = -1;
      }
      index += direction;
    }
    return index;
  }
}
