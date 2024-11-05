package leetcode;

public class P0888 {
  public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int sumAlice = 0;
    int sumBob = 0;
    for (int i : aliceSizes) {
      sumAlice += i;
    }
    for (int i : bobSizes) {
      sumBob += i;
    }
    int target = (sumAlice - sumBob) / 2;
    for (int i : aliceSizes) {
      int diff = i - target;
      for (int j : bobSizes) {
        if (diff == j) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }
}
