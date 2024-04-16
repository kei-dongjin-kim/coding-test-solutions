package leetcode;

public class P0129 {

    public int sumNumbers(TreeNode root) {
        return traceTree(root, 0);
    }
    public int traceTree(TreeNode node, int num) {
        if (node == null) {
            return 0;
        }
        int payload = (num * 10) + node.val;
        if (node.left == null && node.right == null) {
            return payload;
        } else {
            return traceTree(node.left, payload) + traceTree(node.right, payload);
        }
    }

//    int sum = 0;
//    public int sumNumbers(TreeNode root) {
//        traceTree(root, 0);
//        return sum;
//    }
//    public void traceTree(TreeNode node, int num) {
//        int payload = (num * 10) + node.val;
//        if (node.left == null && node.right == null) {
//            sum += payload;
//        } else {
//            if (node.left != null) traceTree(node.left, payload);
//            if (node.right != null) traceTree(node.right, payload);
//        }
//    }
}
