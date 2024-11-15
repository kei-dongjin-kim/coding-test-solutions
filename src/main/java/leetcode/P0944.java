package leetcode;

public class P0944 {
  public int minDeletionSize(String[] strs) {
    int count = 0;
    for (int i=0 ; i<strs[0].length() ; i++) {
      char previous = strs[0].charAt(i);
      for (int j=1 ; j<strs.length ; j++) {
        char current = strs[j].charAt(i);
        if (previous > current) {
          count++;
          break;
        }
        previous = current;
      }
    }
    return count;
  }
}
