package leetcode;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class P0884Test {
  
  @Test
  void test1() {
    String s1 = "hi hello mango";
    String s2 = "hi hello grape";
    String[] expected = {"mango", "grape"};
    P0884 solution = new P0884();
    String[] actual = solution.uncommonFromSentences(s1, s2);
    Arrays.sort(expected);
    Arrays.sort(actual);
    for (int i = 0; i < Math.min(expected.length, actual.length); i++) {
      assert expected[i].equals(actual[i]);
    }
  }
}
