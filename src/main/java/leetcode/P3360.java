package leetcode;

public class P3360 {
  public boolean canAliceWin(int n) {
    int curr = 10;
    while (n > 0) {
      n -= curr;
      if (n < 0) {
        break;
      }
      curr--;
    }
    return curr % 2 == 1;
  }  
}
