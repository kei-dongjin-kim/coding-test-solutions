package leetcode;

import org.junit.jupiter.api.Test;

public class P0521Test {
  
  @Test
  void test1() {
    String a = "abcde";
    String b = "abxyz";
    int expected = 5;
    P0521 solution = new P0521();
    int actual = solution.findLUSlength(a, b);
    System.out.println(actual);
    assert expected == actual;
  }
}
