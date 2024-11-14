package leetcode;

public class P0941 {
  public boolean validMountainArray(int[] arr) {
    int len = arr.length;
    int left = 0;
    int right = len - 1;
    while (left < len - 1 && arr[left] < arr[left + 1]) {
      left++;
    }
    while (0 < right && arr[right - 1] > arr[right]) {
      right--;
    }
    return left == right && left != 0 && left != len - 1;
  }
}
