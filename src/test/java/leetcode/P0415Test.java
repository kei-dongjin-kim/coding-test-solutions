package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0415Test {
  
  @Test
  @DisplayName("num1 = 12345, num2 = 12345")
  void test1() {
    String num1 = "12345";
    String num2 = "12345";
    String expected = "24690";
    String actual = new P0415().addStrings(num1, num2);
    assert expected.equals(actual);
  }

  @Test
  @DisplayName("num1 = 6, num2 = 4")
  void test2() {
    String num1 = "6";
    String num2 = "4";
    String expected = "10";
    String actual = new P0415().addStrings(num1, num2);
    assert expected.equals(actual);
  }
}
