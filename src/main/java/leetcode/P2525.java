package leetcode;

public class P2525 {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = false;
        boolean isHeavy = false;
        String category = "";
        long volume = (long) length * width * height;
        if (
            length >= 10_000 ||
            width >= 10_000 ||
            height >= 10_000 ||
            volume >= 1_000_000_000
        ) {
            isBulky = true;
        }
        if (mass >= 100) {
            isHeavy = true;
        }
        if (isBulky && isHeavy) {
            category = "Both";
        } else if (isBulky) {
            category = "Bulky";
        } else if (isHeavy) {
            category = "Heavy";
        } else {
            category = "Neither";
        }
        return category;
    }
}
