package leetcode;

public class P0883 {
  public int projectionArea(int[][] grid) {
    int x = grid.length;
    int y = grid[0].length;
    int top = 0, front = 0, side = 0;
    int[] frontArr = new int[y];
    int[] sideArr = new int[x];
    for (int i=0 ; i<x ; i++) {
      int max = 0;
      for (int j=0 ; j<y ; j++) {
        if (grid[i][j] > 0) {
          top++;
        }
        frontArr[j] = Math.max(frontArr[j], grid[i][j]);
        max = Math.max(max, grid[i][j]);
      }
      sideArr[i] = max;
    }
    for (int f : frontArr) {
      front += f;
    }
    for (int s : sideArr) {
      side += s;
    }
    return top + front + side;
  }
}
