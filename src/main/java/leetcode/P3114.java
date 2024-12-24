package leetcode;

public class P3114 {
  public String findLatestTime(String s) {
    StringBuilder out = new StringBuilder();
    String[] hours = {"11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01", "00"};
    if (s.charAt(0) == '?' && s.charAt(1) == '?') {
      out.append("11");
    } else if (s.charAt(0) == '?') {
      for (String h : hours) {
        if (h.charAt(1) == s.charAt(1)) {
          out.append(h);
          break;
        }
      }
    } else if (s.charAt(1) == '?') {
      for (String h : hours) {
        if (h.charAt(0) == s.charAt(0)) {
          out.append(h);
          break;
        }
      }
    } else {
      out.append(s.substring(0, 2));
    }
    out.append(':');
    out.append('?' == s.charAt(3) ? '5' : s.charAt(3));
    out.append('?' == s.charAt(4) ? '9' : s.charAt(4));
    return out.toString();
  }
}
