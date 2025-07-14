package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P0929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            int idx = s.indexOf("@");
            String local = s.substring(0, idx);
            String domain = s.substring(idx);
            idx = local.indexOf("+");
            if (idx != -1) {
                local = local.substring(0, idx);
            }
            local = local.replaceAll("\\.", "");
            set.add(local + domain);
        }
        return set.size();
    }
}
