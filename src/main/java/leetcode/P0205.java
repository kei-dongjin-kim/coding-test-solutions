package leetcode;

public class P0205 {
    public boolean isIsomorphic(String s, String t) {
        int[] asciiS = new int[127];
        int[] asciiT = new int[127];
        for (int i=0 ; i<s.length() ; i++) {
            if (asciiS[s.charAt(i)] != asciiT[t.charAt(i)]) return false;
            if (asciiS[s.charAt(i)] == 0) asciiS[s.charAt(i)] = i+1;
            if (asciiT[t.charAt(i)] == 0) asciiT[t.charAt(i)] = i+1;
        }
        return true;

        // int lenS = s.length();
        // int lenT = t.length();
        // if (lenS != lenT) return false;
        // Map<Character, Integer> mapS = new HashMap<>();
        // Map<Character, Integer> mapT = new HashMap<>();
        // int currS = -1;
        // int currT = -1;
        // for (int i=0 ; i<s.length() ; i++) {
        //     char charS = s.charAt(i);
        //     char charT = t.charAt(i);
        //     if (mapS.containsKey(charS)) {
        //         currS = mapS.get(charS);
        //     } else {
        //         currS = i;
        //         mapS.put(charS, i);
        //     }
        //     if (mapT.containsKey(charT)) {
        //         currT = mapT.get(charT);
        //     } else {
        //         currT = i;
        //         mapT.put(charT, i);
        //     }
        //     if (currS != currT) return false;
        // }
        // return true;
    }
}
