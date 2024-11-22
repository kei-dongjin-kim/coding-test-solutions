package leetcode;

import org.junit.jupiter.api.Test;

public class P0500Test {
  
  @Test
  void test1() {
    String[] words = {"aksdjflaksdfjlkajsdf", "qaz", "wsx"};
    String[] expected = {"aksdjflaksdfjlkajsdf"};
    P0500 solution = new P0500();
    String[] actual = solution.findWords(words);
    assert expected.length == actual.length && expected[0].equals(actual[0]);
  }
}
