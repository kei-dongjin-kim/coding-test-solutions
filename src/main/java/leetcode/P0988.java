package leetcode;

public class P0988 {
    String smallest = "";
    public String smallestFromLeaf(TreeNode root) {
        traceTree(root, "");
        return smallest;
    }
    public void traceTree(TreeNode node, String current) {
        current = (char) (node.val + 'a') + current;
        if (node.left == null && node.right == null) {
            if (smallest.isEmpty() || smallest.compareTo(current) > 0) {
                smallest = current;
            }
        } else {
            if (node.left != null) traceTree(node.left, current);
            if (node.right != null) traceTree(node.right, current);
        }
    }
}
