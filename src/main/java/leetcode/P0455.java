package leetcode;

import java.util.Arrays;

public class P0455 {
  public int findContentChildren(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);
    int gi = 0;
    for (int si=0 ; si<s.length && gi<g.length ; si++) {
      if (g[gi] <= s[si]) {
        gi++;
      }
    }
    return gi;
  }
}
