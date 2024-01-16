package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P2225Test {

    @Test
    @DisplayName("findWinners")
    void findWinners() {
        P2225 p2225 = new P2225();
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> result = new ArrayList<>() {{
            add(new ArrayList<Integer>() {{ add(1); add(2); add(10); }});
            add(new ArrayList<Integer>() {{ add(4); add(5); add(7); add(8); }});
        }};

        assertEquals(result, p2225.findWinners(matches));
    }

}
