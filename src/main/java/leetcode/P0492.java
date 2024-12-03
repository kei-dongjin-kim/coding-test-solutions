package leetcode;

public class P0492 {
  public int[] constructRectangle(int area) {
    int[] result = new int[2];
    int sqrted = (int)Math.sqrt(area);
    for (int i=sqrted ; i>0 ; i--) {
      if (area % i == 0) {
        result[0] = area / i;
        result[1] = i;
        break;
      }
    }
    return result;
  }
}
