package leetcode;

public class P0504 {
  public String convertToBase7(int num) {
    StringBuilder sb = new StringBuilder();
    String mark = num < 0 ? "-" : "";
    num = Math.abs(num);
    while(num >= 7) {
      sb.append(num % 7);
      num /= 7;
    }
    sb.append(num);
    return mark + sb.reverse().toString();
  }
}
