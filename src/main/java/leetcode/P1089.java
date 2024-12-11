package leetcode;

public class P1089 {
  public void duplicateZeros(int[] arr) {
    int len = arr.length;
    for (int i = 0; i < len; i++) {
      if (arr[i] == 0) {
        for (int j = len - 1; i < j - 1; j--) {
          arr[j] = arr[j - 1];
        }
        if (i + 1 < len) {
          arr[i + 1] = 0;
        }
        i++;
      }
    }
  }
}
