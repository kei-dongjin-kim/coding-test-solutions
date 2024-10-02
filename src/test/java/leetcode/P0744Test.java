package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0744Test {
  
  @Test
  @DisplayName("letters = [ c, d, f ] target = a")
  void test1() {
    char[] letters = new char[] { 'c', 'd', 'f' };
    char target = 'a';
    char expected = 'c';
    P0744 solution = new P0744();
    char actual = solution.nextGreatestLetter(letters, target);
    assert expected == actual;
  }

  @Test
  @DisplayName("letters = [ c, d, f ] target = c")
  void test2() {
    char[] letters = new char[] { 'c', 'd', 'f' };
    char target = 'c';
    char expected = 'd';
    P0744 solution = new P0744();
    char actual = solution.nextGreatestLetter(letters, target);
    assert expected == actual;
  }

  @Test
  @DisplayName("letters = [ c, d, f ] target = f")
  void test3() {
    char[] letters = new char[] { 'c', 'd', 'f' };
    char target = 'f';
    char expected = 'c';
    P0744 solution = new P0744();
    char actual = solution.nextGreatestLetter(letters, target);
    assert expected == actual;
  }

}
