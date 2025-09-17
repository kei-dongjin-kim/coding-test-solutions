package leetcode;

public class P1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] splited = sentence.split(" ");
        int i = 1;
        for (String s : splited) {
            if (s.startsWith(searchWord)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
