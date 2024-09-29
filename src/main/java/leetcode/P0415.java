package leetcode;

public class P0415 {
  public String addStrings(String num1, String num2) {
    StringBuilder result = new StringBuilder();
    StringBuilder sb1 = new StringBuilder(num1);
    StringBuilder sb2 = new StringBuilder(num2);
    sb1.reverse();
    sb2.reverse();
    int num1len = num1.length();
    int num2len = num2.length();
    int maxlen = Math.max(num1len, num2len);
    int carrier = 0;
    for (int i=0 ; i<maxlen ; i++) {
      int num1int = 0;
      if (i < num1len) {
        num1int = sb1.charAt(i) - '0';
      } else {
        num1int = 0;
      }
      int num2int = 0;
      if (i < num2len) {
        num2int = sb2.charAt(i) - '0';
      } else {
        num2int = 0;
      }
      int sum = num1int + num2int + carrier;
      carrier = sum / 10;
      int remainder = sum % 10;
      result.append(remainder);
    }
    if (carrier > 0) {
      result.append(carrier);
    }
    return result.reverse().toString();
  }
}
