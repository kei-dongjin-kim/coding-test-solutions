package leetcode;

import java.util.List;
import java.util.ArrayList;

public class P0728 {
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> result = new ArrayList<>();
    for (int i=left ; i<=right ; i++) {
      boolean check = true;
      int curr = i;
      while (curr > 0) {
        int remainder = curr % 10;
        if (remainder == 0 || i % remainder != 0) {
          check = false;
          break;
        }
        curr /= 10;
      }
      if (check) {
        result.add(i);
      }
    }
    return result;
  }
}
