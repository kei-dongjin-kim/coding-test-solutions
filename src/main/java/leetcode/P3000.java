package leetcode;

public class P3000 {
  public int areaOfMaxDiagonal(int[][] dimensions) {
    double longest = 0d;
    int maxArea = 0;
    for (int[] d : dimensions) {
      double diagonal = d[0] * d[0] + d[1] * d[1];
      if (longest < diagonal) {
        longest = diagonal;
        maxArea = d[0] * d[1];
      } else if (longest == diagonal) {
        maxArea = Math.max(d[0] * d[1], maxArea);
      }
    }
    return maxArea;
  }
}
