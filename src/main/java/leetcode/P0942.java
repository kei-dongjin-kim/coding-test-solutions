package leetcode;

public class P0942 {
    public int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        int left = 0, right = s.length();
        int index = 0;
        for (char c : s.toCharArray()) {
            if (c == 'I') {
                result[index] = left;
                left++;
            } else {
                result[index] = right;
                right--;
            }
            index++;
        }
        result[index] = left;
        return result;
    }
}
