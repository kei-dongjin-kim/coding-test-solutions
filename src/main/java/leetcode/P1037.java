package leetcode;

public class P1037 {
  public boolean isBoomerang(int[][] points) {
    // Calculate the area of the triangle formed by the three points.
    return Math.abs(
      points[0][0] * (points[1][1] - points[2][1]) + 
      points[1][0] * (points[2][1] - points[0][1]) + 
      points[2][0] * (points[0][1] - points[1][1])
    ) * 0.5 > 0;
  }
}
