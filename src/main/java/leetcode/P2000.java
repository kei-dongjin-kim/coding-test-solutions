package leetcode;

public class P2000 {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1) return word;
        StringBuilder prefix = new StringBuilder(word.substring(0, index + 1));
        return prefix.reverse().toString() + word.substring(index + 1);

//        StringBuilder sb = new StringBuilder(word);
//        for (int i=0 ; i<sb.length() ; i++) {
//            if (sb.charAt(i) == ch) {
//                int left = 0;
//                int right = i;
//                while (left < right) {
//                    char tmp = sb.charAt(right);
//                    sb.setCharAt(right, sb.charAt(left));
//                    sb.setCharAt(left, tmp);
//                    left++;
//                    right--;
//                }
//                break;
//            }
//        }
//        return sb.toString();
    }
}
