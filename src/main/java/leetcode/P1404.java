package leetcode;

public class P1404 {
    public int numSteps(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder(s);
        while (!sb.toString().equals("1")) {
            int len = sb.length();
            if (sb.charAt(len - 1) == '0') {
                sb.deleteCharAt(len - 1);
            } else {
                for (int i=1 ; i<=len ; i++) {
                    if (sb.charAt(len - i) == '1') {
                        sb.setCharAt(len - i, '0');
                        if (i == len) {
                            sb.insert(0, '1');
                        }
                    } else {
                        sb.setCharAt(len - i, '1');
                        break;
                    };
                }
            }
            count++;
        }
        return count;
    }
}
