package leetcode;

import org.junit.jupiter.api.Test;

public class P3340Test {

  @Test
  void test1() {
    String num = "1122334455";
    boolean expected = true;
    P3340 solution = new P3340();
    boolean actual = solution.isBalanced(num);
    assert expected == actual;
  }
}
