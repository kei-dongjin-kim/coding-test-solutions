package leetcode;

public class P0520 {
  public boolean detectCapitalUse(String word) {
    int len = word.length();
    if (len == 1) {
      return true;
    }
    boolean is1stUpper = Character.isUpperCase(word.charAt(0));
    boolean is2ndUpper = Character.isUpperCase(word.charAt(1));
    boolean is3rdUpper = false;
    if (is1stUpper && is2ndUpper) {
      is3rdUpper = true;
    } else if (is1stUpper && !is2ndUpper) {
      is3rdUpper = false;
    } else if (!is1stUpper && is2ndUpper) {
      return false;
    } else {
      is3rdUpper = false;
    }
    for (int i=2 ; i<len ; i++) {
      boolean curr = Character.isUpperCase(word.charAt(i));
      if (curr != is3rdUpper) {
        return false;
      }
    }
    return true;
  }
}
