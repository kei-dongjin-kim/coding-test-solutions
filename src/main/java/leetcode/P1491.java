package leetcode;

public class P1491 {
    public double average(int[] salary) {
        int sum = 0;
        int max = salary[0];
        int min = salary[0];
        for (int s : salary) {
            sum += s;
            min = Math.min(min, s);
            max = Math.max(max, s);
        }
        sum = sum - min - max;
        double average = (double) sum / (salary.length - 2);
        return Math.round(average * 100000) / 100000.0;
    }
}
