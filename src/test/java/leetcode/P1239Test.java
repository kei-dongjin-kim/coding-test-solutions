package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class P1239Test {

    @Test
    @DisplayName("[\"un\",\"iq\",\"ue\"]")
    void maxLength1() {
        P1239 solution = new P1239();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("un");
        arr.add("iq");
        arr.add("ue");
        assert(solution.maxLength(arr) == 4);
    }

    @Test
    @DisplayName("[\"cha\",\"r\",\"act\",\"ers\"]")
    void maxLength2() {
        P1239 solution = new P1239();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("cha");
        arr.add("r");
        arr.add("act");
        arr.add("ers");
        assert(solution.maxLength(arr) == 6);
    }
}
