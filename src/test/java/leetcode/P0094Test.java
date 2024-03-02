package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class P0094Test {

    @Test
    @DisplayName("root = [1,null,2,3]")
    void inorderTraversal_Test1() {
        P0094 solution = new P0094();
        P0094.TreeNode root = new P0094.TreeNode(1, null, new P0094.TreeNode(2, new P0094.TreeNode(3), null));
        List<Integer> actual = solution.inorderTraversal(root);
        List<Integer> expected = List.of(1, 3, 2);
        assert expected.equals(actual);
    }
}
