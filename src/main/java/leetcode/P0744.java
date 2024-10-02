package leetcode;

public class P0744 {
  public char nextGreatestLetter(char[] letters, char target) {
    int len = letters.length;
    int left = 0, right = len - 1;
    if (target < letters[left] || letters[right] <= target) {
      return letters[left];
    }
    while (left < right && right - left > 1) {
      int center = left + ((right - left) / 2);
      if (target < letters[center]) {
        right = center;
      } else {
        left = center;
      }
    }
    return letters[right];
}
}
