package leetcode;

public class P1544 {
    public String makeGood(String s) {
        if (s.length() <= 1) return s;

        StringBuilder sb = new StringBuilder();
        sb.append(s);

        boolean isGood = false;
        while (!isGood) {
            isGood = true;
            for( int i=1 ; i<sb.length() ; i++) {
                if (
                    (sb.charAt(i-1) != sb.charAt(i)) &&
                    (Character.toLowerCase(sb.charAt(i-1)) == Character.toLowerCase(sb.charAt(i)))
                ) {
                    sb.delete(i-1, i+1);
                    isGood = false;
                    break;
                }
            }
        }

        return sb.toString();
    }
}
