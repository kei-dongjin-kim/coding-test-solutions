package leetcode;

public class P0860 {
  public boolean lemonadeChange(int[] bills) {
    int unit5 = 0, unit10 = 0, unit20 = 0;
    for (int b : bills) {
      if (b == 5) {
        unit5++;
      } else if (b == 10) {
        unit10++;
        if (unit5 >= 1) {
          unit5--;
        } else {
          return false;
        }
      } else if (b == 20) {
        unit20++;
        if (unit10 >= 1 && unit5 >= 1) {
          unit10--;
          unit5--;
        } else if (unit5 >= 3) {
          unit5 -= 3;
        } else {
          return false;
        }
      }
    }
    return true;
  }
}
