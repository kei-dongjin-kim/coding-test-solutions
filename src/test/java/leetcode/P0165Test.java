package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0165Test {

    @Test
    @DisplayName("version1 = 0.1, version2 = 1.1")
    void test1() {
        String version1 = "0.1";
        String version2 = "1.1";
        int expected = -1;
        assert new P0165().compareVersion(version1, version2) == expected;
    }
}
