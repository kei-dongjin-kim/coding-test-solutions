package leetcode;

public class P1422 {
  public int maxScore(String s) {
    char[] sc = s.toCharArray();
    int left = sc[0] == '0' ? 1 : 0;
    int right = 0;
    for (int i = 1; i < sc.length; i++) {
      if (sc[i] == '1') {
        right++;
      }
    }
    int max = left + right;
    for (int i = 1; i < sc.length - 1; i++) {
      if (sc[i] == '0') {
        left++;
      } else {
        right--;
      }
      max = Math.max(max, left + right);
    }
    return max;
  }
}
