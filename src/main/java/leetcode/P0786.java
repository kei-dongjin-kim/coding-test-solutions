package leetcode;

import java.util.*;

public class P0786 {
    class Fraction {
        int numerator, denominator;
        double value;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
            this.value = (double) numerator / denominator;
        }
    }

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<Fraction> pq = new PriorityQueue<>((a, b) -> Double.compare(a.value, b.value));

        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                pq.offer(new Fraction(arr[i], arr[j]));
            }
        }

        Fraction result = null;
        for (int i = 0; i < k; i++) {
            result = pq.poll();
        }

        return new int[]{result.numerator, result.denominator};
    }
}
