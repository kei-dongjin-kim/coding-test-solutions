package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P1436Test {

    @Test
    void test1() {
        List<List<String>> paths = new ArrayList<>();
        List<String> path1 = new ArrayList<>();
        path1.add("A");
        path1.add("B");
        paths.add(path1);
        List<String> path2 = new ArrayList<>();
        path2.add("B");
        path2.add("C");
        paths.add(path2);
        List<String> path3 = new ArrayList<>();
        path3.add("C");
        path3.add("D");
        paths.add(path3);
        List<String> path4 = new ArrayList<>();
        path4.add("D");
        path4.add("E");
        paths.add(path4);
        String expected = "E";
        P1436 solution = new P1436();
        String actual = solution.destCity(paths);
        assert expected.equals(actual);
    }
}
