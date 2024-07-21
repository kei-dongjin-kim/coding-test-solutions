package leetcode;

public class P0108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        if (len == 0) return null;
        int half = nums.length / 2;
        int rest = len - half - 1;
        int[] leftArray = new int[half];
        System.arraycopy(nums, 0, leftArray, 0, half);
        int[] rightArray = new int[rest];
        System.arraycopy(nums, half + 1, rightArray, 0, rest);
        TreeNode left = sortedArrayToBST(leftArray);
        TreeNode right = sortedArrayToBST(rightArray);
        return new TreeNode(nums[half], left, right);
    }
}
