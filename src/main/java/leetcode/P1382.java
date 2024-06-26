package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P1382 {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        return createBalancedBST(inorder, 0, inorder.size() - 1);
    }
    private void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node == null) return;

        inorderTraversal(node.left, list);
        list.add(node.val);
        inorderTraversal(node.right, list);
    }
    private TreeNode createBalancedBST(List<Integer> list, int start, int end) {
        if (start > end) return null;

        int mid = start + (end - start) / 2;

        TreeNode left = createBalancedBST(list, start, mid - 1);
        TreeNode right = createBalancedBST(list, mid + 1, end);

        return new TreeNode(list.get(mid), left, right);
    }
}
