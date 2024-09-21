package leetcode;

public class P0441 {
  public int arrangeCoins(int n) {
    int k = 1;
    while (n >= k) {
      n -= k++;
    }
    return k - 1;
  }
}
