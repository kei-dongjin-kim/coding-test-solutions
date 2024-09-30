package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P0728Test {
  
  @Test
  @DisplayName("left = 66, right = 77")
  void test1() {
    int left = 66;
    int right = 77;
    List<Integer> expected = new ArrayList<>();
    expected.add(66);
    expected.add(77);
    List<Integer> actual = new P0728().selfDividingNumbers(left, right);
    for (int i=0 ; i < actual.size(); ++i) {
      assert expected.get(i).equals(actual.get(i));
    }
  }
}
