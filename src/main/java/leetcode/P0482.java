package leetcode;

public class P0482 {
  public String licenseKeyFormatting(String s, int k) {
    s = s.replaceAll("-", "");
    s = s.toUpperCase();
    StringBuilder sb = new StringBuilder(s);
    int len = sb.length();
    int m = len / k;
    int n = len % k;
    int turn = n > 0 ? m : m - 1;
    for (int i=1 ; i<=turn ; i++) {
        sb.insert(len - (i * k), "-");
    }
    return sb.toString();
  }
}
