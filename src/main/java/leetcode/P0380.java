package leetcode;

import java.util.ArrayList;

public class P0380 {
    ArrayList<Integer> list;

    public P0380() {
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (list.contains(val)) {
            return false;
        } else {
            list.add(val);
            return true;
        }
    }

    public boolean remove(int val) {
        int index = list.indexOf(val);
        if (index != -1) {
            list.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        int randomIndex = (int)(Math.random() * list.size());
        return list.get(randomIndex);
    }

    public void print() {
        System.out.println("===========================");
        System.out.println("list.size() = " + list.size());
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
