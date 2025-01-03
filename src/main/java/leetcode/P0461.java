package leetcode;

public class P0461 {
  public int hammingDistance(int x, int y) {
    int xor = x ^ y;
    int count = 0;
    while (xor != 0) {
      if (xor % 2 == 1) {
        count++;
      }
      xor >>= 1;
    }
    return count;
  }
}
