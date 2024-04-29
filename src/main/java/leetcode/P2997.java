package leetcode;

public class P2997 {
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        for (int num : nums) xor ^= num;
        return Integer.bitCount(xor ^ k);

//        int count = 0;
//        int xorResult = nums[0];
//        for (int i=1 ; i<nums.length ; i++) {
//            xorResult ^= nums[i];
//        }
//        String str1 = Integer.toBinaryString(xorResult);
//        String str2 = Integer.toBinaryString(k);
//        int length1 = str1.length();
//        int length2 = str2.length();
//        if (length1 < length2) {
//            str1 = String.format("%" + length2 + "s", str1).replace(' ', '0');
//        } else if (length1 > length2) {
//            str2 = String.format("%" + length1 + "s", str2).replace(' ', '0');
//        }
//        for (int i = 0; i < str1.length(); i++) {
//            if (str1.charAt(i) != str2.charAt(i)) {
//                count++;
//            }
//        }
//        return count;
    }
}
