package leetcode;

public class P3099 {
  public int sumOfTheDigitsOfHarshadNumber(int x) {
    int sum = 0;
    int a = x;
    while (a > 0) {
      sum += a % 10;
      a /= 10;
    }
    return x % sum == 0 ? sum : -1;
  }
}
