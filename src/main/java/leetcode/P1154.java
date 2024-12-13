package leetcode;

public class P1154 {
  public int dayOfYear(String date) {
    int result = 0;
    int year = Integer.valueOf(date.substring(0, 4));
    int month = Integer.valueOf(date.substring(5, 7));
    int day = Integer.valueOf(date.substring(8, 10));
    if (month > 1) {
      result += 31;
    }
    if (month > 2) {
      if (year % 400 == 0) {
        result += 29;
      } else if (year % 100 == 0) {
        result += 28;
      } else if (year % 4 == 0) {
        result += 29;
      } else {
        result += 28;
      }
    }
    for (int i = 3; i < month; i++) {
      if (
        i == 3 ||
        i == 5 ||
        i == 7 ||
        i == 8 ||
        i == 10
      ) {
        result += 31;
      } else {
        result += 30;
      }
    }
    result += day;
    return result;
  }
}
