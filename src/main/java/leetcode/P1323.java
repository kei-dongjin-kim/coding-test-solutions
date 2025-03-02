package leetcode;

public class P1323 {
    public int maximum69Number (int num) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for (char c : String.valueOf(num).toCharArray()) {
            if (c == '6' && flag) {
                sb.append('9');
                flag = false;
            } else {
                sb.append(c);
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
