package leetcode;

import org.junit.jupiter.api.Test;

public class P3083Test {

  @Test
  void test1() {
    String s = "abcdefghijklmnopqrstuvwxyz";
    boolean expected = false;
    P3083 solution = new P3083();
    boolean actual = solution.isSubstringPresent(s);
    assert expected == actual;
  }

  @Test
  void test2() {
    String s = "abccccccc";
    boolean expected = true;
    P3083 solution = new P3083();
    boolean actual = solution.isSubstringPresent(s);
    assert expected == actual;
  }

}
