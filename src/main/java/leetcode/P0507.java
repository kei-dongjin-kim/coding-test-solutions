package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0507 {
  public boolean checkPerfectNumber(int num) {
    if (num % 2 == 1) {
      return false;
    }
    List<Integer> list = new ArrayList<>();
    list.add(1);
    int right = num / 2;
    for (int i=2 ; i<right ; i++) {
      if (num % i == 0) {
        right = num / i;
        if (!list.contains(i)) {
          list.add(i);
        }
        if (!list.contains(right)) {
          list.add(right);
        }
      }
    }
    int sum = 0;
    for (Integer i : list) {
      sum += i;
    }
    return num == sum;
  }
}
