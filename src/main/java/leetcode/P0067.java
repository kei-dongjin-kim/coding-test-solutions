package leetcode;

public class P0067 {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            carry = sum > 1 ? 1 : 0;
            res.append(sum % 2);
        }
        if(carry != 0) res.append(carry);
        return res.reverse().toString();

//        StringBuilder sb = new StringBuilder();
//        while (a.length() != b.length()) {
//            if (a.length() > b.length()) b = "0" + b;
//            else a = "0" + a;
//        }
//        boolean load = false;
//        for (int i=a.length()-1 ; i>=0 ; i--) {
//            if (load) {
//                if (a.charAt(i) == '0' && b.charAt(i) == '0') {
//                    sb.insert(0, '1');
//                    load = false;
//                } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
//                    sb.insert(0, '1');
//                } else {
//                    sb.insert(0, '0');
//                }
//            } else {
//                if (a.charAt(i) == '0' && b.charAt(i) == '0') {
//                    sb.insert(0, '0');
//                } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
//                    sb.insert(0, '0');
//                    load = true;
//                } else {
//                    sb.insert(0, '1');
//                }
//            }
//        }
//        if (load) sb.insert(0, '1');
//        return sb.toString();
    }
}
