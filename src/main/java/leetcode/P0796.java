package leetcode;

public class P0796 {
  public boolean rotateString(String s, String goal) {
    int len = goal.length();
    if (len != s.length()) {
      return false;
    }
    for (int i=0 ; i<len ; i++) {
      for (int j=0 ; j<len ; j++) {
        if (goal.charAt(i) == s.charAt(j)) {
          String newS = s.substring(j, len) + s.substring(0, j);
          if (goal.equals(newS)) {
            return true;
          }
        }
      }
    }
    return false;
  }  
}
