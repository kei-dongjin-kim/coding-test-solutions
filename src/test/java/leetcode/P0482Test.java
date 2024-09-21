package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0482Test {

  @Test
  @DisplayName("s = a-b-c-d-e-f-g-h, k = 4")
  void test1() {
    String s = "a-b-c-d-e-f-g-h";
    int k = 4;
    String expected = "ABCD-EFGH";
    String actual = new P0482().licenseKeyFormatting(s,k);
    assert expected.equals(actual);
  }
  
}
