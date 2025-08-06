package leetcode;

public class P2710 {
    public String removeTrailingZeros(String num) {
        int right = num.length() - 1;
        while (
                right >= 0 &&
                        num.charAt(right) == '0'
        ) {
            right--;
        }
        return num.substring(0, right + 1);
    }
}
