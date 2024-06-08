package leetcode;

import java.util.List;

public class P0648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] arr = sentence.split(" ");
        for (int i=0 ; i<arr.length ; i++) {
            for (String d : dictionary) {
                if (arr[i].startsWith(d)) arr[i] = d;
            }
        }
        return String.join(" ", arr);
    }

    // HashSet Solution (This takes more time than the above.)
    // public String replaceWords(List<String> dictionary, String sentence) {
    //     String[] arr = sentence.split(" ");
    //     Set<String> dicSet = new HashSet<>(dictionary);
    //     for (int i=0 ; i<arr.length ; i++) {
    //         arr[i] = findRoot(arr[i], dicSet);
    //     }
    //     return String.join(" ", arr);
    // }
    // public String findRoot(String word, Set<String> dicSet) {
    //     for (int i=1 ; i<word.length() ; i++) {
    //         String root = word.substring(0, i);
    //         if (dicSet.contains(root)) return root;
    //     }
    //     return word;
}
