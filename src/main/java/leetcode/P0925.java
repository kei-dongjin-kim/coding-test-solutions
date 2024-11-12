package leetcode;

public class P0925 {
  public boolean isLongPressedName(String name, String typed) {
    int nl = name.length();
    int tl = typed.length();
    int ni = 0;
    int ti = 0;
    char previous = name.charAt(0);
    while (ni < nl && ti < tl) {
      char nc = name.charAt(ni);
      char tc = typed.charAt(ti);
      if (nc == tc) {
        ni++;
        ti++;
        previous = nc;
      } else if (tc == previous) {
        ti++;
      } else {
        return false;
      }
    }
    while (ti < tl) {
      char tc = typed.charAt(ti);
      if (previous != tc)  {
        return false;
      }
      ti++;
    }
    return ni == nl && ti == tl;
  }
}
