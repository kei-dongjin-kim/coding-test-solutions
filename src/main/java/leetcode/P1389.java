package leetcode;

public class P1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] target = new int[len];
        for (int i = 0; i < len; i++) {
            if (i != index[i]) {
                for (int j = i; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}
