package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P3075Test {

    @Test
    @DisplayName("happiness = [12,1,42], k = 3")
    void test1() {
        int[] happiness = {12,1,41};
        int k = 3;
        long expected = 52;
        assert new P3075().maximumHappinessSum(happiness, k) == expected;
    }
}
