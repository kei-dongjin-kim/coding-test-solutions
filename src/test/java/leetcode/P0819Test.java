package leetcode;

import org.junit.jupiter.api.Test;

public class P0819Test {
  
  @Test
  void test1() {
    String paragraph = "I like fruits like a apple, banana, and orange. Especially, I like mango.";
    String[] banned = {"apple", "banana"};
    String expected = "like";
    P0819 solution = new P0819();
    String actual = solution.mostCommonWord(paragraph, banned);
    assert expected.equals(actual);
  }
}
