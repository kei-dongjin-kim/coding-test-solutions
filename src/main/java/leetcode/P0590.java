package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0590 {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        if (root.children != null) {
            for (Node node : root.children) {
                List<Integer> nodeList = postorder(node);
                list.addAll(nodeList);
            }
        }
        list.add(root.val);
        return list;
    }
}
