package leetcode;

public class P3270 {
  public int generateKey(int num1, int num2, int num3) {
    int result = 0;
    for (int i = 0; i < 4; i++) {
      int remainder1 = num1 % 10;
      num1 /= 10;
      int remainder2 = num2 % 10;
      num2 /= 10;
      int remainder3 = num3 % 10;
      num3 /= 10;
      int min = Math.min(remainder1, remainder2);
      min = Math.min(min, remainder3);
      result += min * Math.pow(10, i);
    }
    return result;
  }
}
