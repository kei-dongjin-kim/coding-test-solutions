package leetcode;

import java.util.*;

public class Util {
    public static boolean areEqualSingleList(List<Integer> list1, List<Integer> list2) {
        // Convert each inner list to a set and then add it to a set of sets
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        // Compare the two sets of sets
        return set1.equals(set2);
    }
    public static boolean areEqualDoubleList(List<List<Integer>> list1, List<List<Integer>> list2) {
        // Convert each inner list to a set and then add it to a set of sets
        Set<Set<Integer>> set1 = new HashSet<>();
        for (List<Integer> sublist : list1) {
            set1.add(new HashSet<>(sublist));
        }

        Set<Set<Integer>> set2 = new HashSet<>();
        for (List<Integer> sublist : list2) {
            set2.add(new HashSet<>(sublist));
        }
        // Compare the two sets of sets
        return set1.equals(set2);
    }
}
