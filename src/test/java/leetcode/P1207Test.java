package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1207Test {

    @Test
    @DisplayName("[1,2,2,1,1,3]")
    void uniqueOccurrences1() {
        P1207 p1207 = new P1207();
        int[] arr = {1, 2, 2, 1, 1, 3};
        assert (p1207.uniqueOccurrences(arr));
    }

    @Test
    @DisplayName("[1,2]")
    void uniqueOccurrences2() {
        P1207 p1207 = new P1207();
        int[] arr = {1, 2};
        assert (!p1207.uniqueOccurrences(arr));
    }
}
