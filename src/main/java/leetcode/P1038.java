package leetcode;

public class P1038 {

    int sum = 0;
    public TreeNode bstToGst(TreeNode root) {
        bstToGstHelper(root);
        return root;
    }
    private void bstToGstHelper(TreeNode root) {
        if (root == null) return;

        bstToGstHelper(root.right);
        sum += root.val;
        root.val = sum;
        bstToGstHelper(root.left);
    }

//    public TreeNode bstToGst(TreeNode root) {
//        int[] nodeSum = new int[1];
//        bstToGstHelper(root, nodeSum);
//        return root;
//    }
//    private void bstToGstHelper(TreeNode root, int[] nodeSum) {
//        if (root == null) {
//            return;
//        }
//        bstToGstHelper(root.right, nodeSum);
//        nodeSum[0] += root.val;
//        root.val = nodeSum[0];
//        bstToGstHelper(root.left, nodeSum);
//    }
}
