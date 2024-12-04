package leetcode;

public class P0495 {
  public int findPoisonedDuration(int[] timeSeries, int duration) {
    int result = 0;
    int len = timeSeries.length;
    for (int i=0 ; i<len-1 ; i++) {
      if (timeSeries[i+1] - timeSeries[i] < duration) {
        result += timeSeries[i + 1] - timeSeries[i];
      } else {
        result += duration;
      }
    }
    result += duration;
    return result;
  }
}
