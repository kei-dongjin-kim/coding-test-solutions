package leetcode;

public class P0605 {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    if (n == 0) {
    	return true;
    }
    int len = flowerbed.length;
    int[] arr = new int[len];
    for(int i=0 ; i<len ; i++) {
      if (flowerbed[i] == 1) {
        if (1 <= i) {
          arr[i-1] = 1;
        }
        arr[i] = 1;
        if (i <= len-2) {
          arr[i+1] = 1;
        }
      }
    }
    int count = 0;
    int blank = 0;
    for (int a : arr) {
      if (a == 0) {
        blank++;
      } else {
        count += (blank + 1) / 2;
        blank = 0;
      }
    }
    if (blank != 0) {
      count += (blank + 1) / 2;
    }
    return count >= n;
  }
}
