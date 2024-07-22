package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2418Test {

    @Test
    @DisplayName("names = [Sally, David, Watson], heights = [3,1,2]")
    void test1() {
        P2418 p2418 = new P2418();
        String[] names = {"Sally", "David", "Watson"};
        int[] heights = {3, 1, 2};
        String[] expected = {"Sally", "Watson", "David"};
        String[] actual = p2418.sortPeople(names, heights);
        for (int i=0 ; i<expected.length ; i++) {
            assert(expected[i].equals(actual[i]));
        }
    }
}
