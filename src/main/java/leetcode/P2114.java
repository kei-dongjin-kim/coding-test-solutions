package leetcode;

public class P2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String[] splited = sentences[i].split(" ");
            max = Math.max(max, splited.length);
        }
        return max;
    }
}
