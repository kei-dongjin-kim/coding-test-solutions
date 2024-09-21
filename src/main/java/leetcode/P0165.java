package leetcode;

public class P0165 {
    public int compareVersion(String version1, String version2) {
        if (version1.equals(version2)) return 0;

        // split
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        // lengths
        int v1len = v1.length;
        int v2len = v2.length;
        int maxlength = Math.max(v1len, v2len);
        // compare
        for (int i=0 ; i<maxlength ; i++) {
            int currv1 = 0;
            int currv2 = 0;
            if (i < v1len) currv1 = Integer.parseInt(v1[i]);
            if (i < v2len) currv2 = Integer.parseInt(v2[i]);
            if (currv1 < currv2) return -1;
            else if (currv1 > currv2) return 1;
        }
        return 0;
    }
}
