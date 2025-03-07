package leetcode;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class P3248Test {

    @Test
    void test1() {
        int n = 10;
        List<String> commands = new ArrayList<>();
        commands.add("RIGHT");
        commands.add("RIGHT");
        commands.add("DOWN");
        commands.add("DOWN");
        commands.add("LEFT");
        commands.add("UP");
        int expected = 11;
        P3248 solution = new P3248();
        int actual = solution.finalPositionOfSnake(n, commands);
        assert expected == actual;
    }
}
