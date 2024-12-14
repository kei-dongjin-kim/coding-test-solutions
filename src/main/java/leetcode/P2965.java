package leetcode;

public class P2965 {
  public int[] findMissingAndRepeatedValues(int[][] grid) {
    int[] result = new int[2];
    int rowlen = grid.length;
    int collen = grid[0].length;
    int[] arr = new int[rowlen * collen + 1];
    for (int[] r : grid) {
      for (int c : r) {
        arr[c]++;
      }
    }
    for (int i = 1; i<arr.length; i++) {
      if (arr[i] == 2) {
        result[0] = i;
      }
      if (arr[i] == 0) {
        result[1] = i;
      }
    }
    return result;
  }
}
