package leetcode;

import java.util.Arrays;

public class P2864 {
    public String maximumOddBinaryNumber(String s) {
        int count1 = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) if (c == '1') count1++;
        Arrays.fill(arr, '0');
        arr[arr.length-1] = '1';
        for (int i=0 ; i<count1-1 ; i++) arr[i] = '1';
        return new String(arr);

        // char[] arr = s.toCharArray();
        // int len = arr.length;
        // int secondLast = len - 2;
        // Arrays.sort(arr);
        // for (int i=0 ; i<len/2 ; i++) {
        //     char temp = arr[i];
        //     arr[i] = arr[secondLast - i];
        //     arr[secondLast - i] = temp;
        // }
        // return new String(arr);
    }
}
