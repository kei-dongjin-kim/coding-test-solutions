package leetcode;


public class P0868 {
  public int binaryGap(int n) {
    // TODO: need to solve this problem by using bit operation
    String str = Integer.toBinaryString(n);
    int max = 0;
    int idx = -1;
    for (int i=0 ; i<str.length() ; i++) {
      if (idx != -1 && str.charAt(i) == '1') {
        max = Math.max(max, i - idx);
        idx = -1;
      }
      if (str.charAt(i) == '1') {
        idx = i;
      }
    }
    return max;
  }
}
