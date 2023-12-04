package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;
// разница в скорости между ArrayList и LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(2);
        nums.add(4);
        nums.add(7);
        nums.add(9);
        nums.add(0);
        System.out.println(nums);
        System.out.println();
        nums.set(0,1);
        System.out.println(nums);
        nums.clear();
        System.out.println(nums);


    }
}
