package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class P0590Test {

    @Test
    @DisplayName("root = [1,null,3,2,4,null]")
    void test1() {
        Node root = new Node(1);
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(4);
        root.children = List.of(node1, node2, node3);
        List<Integer> expected = List.of(3, 2, 4, 1);
        P0590 solution = new P0590();
        List<Integer> actual = solution.postorder(root);
        for (int i = 0; i < expected.size(); i++) {
            assert expected.get(i).equals(actual.get(i));
        }
    }
}
