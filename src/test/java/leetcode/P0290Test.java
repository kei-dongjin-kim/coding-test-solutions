package leetcode;

import org.junit.jupiter.api.Test;

public class P0290Test {
  
  @Test
  void test1() {
    String pattern = "abba";
    String s = "AAA BBB BBB AAA";
    P0290 solution = new P0290();
    assert solution.wordPattern(pattern, s);
  }
}
