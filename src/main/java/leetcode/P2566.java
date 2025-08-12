package leetcode;

public class P2566 {
    public int minMaxDifference(int num) {
        char digit = '9';
        String str = String.valueOf(num);
        int len = str.length();
        for (char c : str.toCharArray()) {
            if (c != '9') {
                digit = c;
                break;
            }
        }
        String max = str.replace(digit, '9');
        digit = str.charAt(0);
        String min = str.replace(digit, '0');
        return Integer.parseInt(max) - Integer.parseInt(min);
    }
}
