package leetcode;

import java.util.HashMap;
import java.util.Map;

public class P1915 {
    public long wonderfulSubstrings(String word) {
        int len = word.length();

        // Create the frequency map
        // Key = bitmask, Value = frequency of bitmask key
        Map<Integer, Integer> freq = new HashMap<>();

        // The empty prefix can be the smaller prefix, which is handled like this
        freq.put(0, 1);

        int mask = 0;
        long res = 0L;
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            int bit = c - 'a';

            // Flip the parity of the c-th bit in the running prefix mask
            // 1 << bit creates a mask with only the bit-th bit set
            // ^ is the XOR operator, which flips the bit-th bit in the mask
            // So, if the bit is already set, then unset it
            // For example, if the mask is 1010 and the bit is 1, then the mask becomes 1000
            mask ^= (1 << bit);

            // Count smaller prefixes that create substrings with no odd occurring letters
            res += freq.getOrDefault(mask, 0);

            // Increment value associated with mask by 1
            freq.put(mask, freq.getOrDefault(mask, 0) + 1);

            // Loop through every possible letter that can appear an odd number of times in a substring
            for (int odd_c=0; odd_c < 10; odd_c++) {
                res += freq.getOrDefault(mask ^ (1 << odd_c),0);
            }
        }
        return res;
    }
}
