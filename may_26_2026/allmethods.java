package may_26_2026;

//1. containsAll() method
//2. retainAll() method
//3. removeAll() method

import java.util.*;

public class allmethods {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("orange");

        // containsAll() method
        boolean containsAll = list1.containsAll(list2);
        System.out.println("list1 contains all elements of list2: " + containsAll);

        // retainAll() method
        System.out.println("Before retainAll, list1: " + list1);
        list1.retainAll(list2);
        System.out.println("After retainAll, list1: " + list1);

        // removeAll() method
        System.out.println("Before removeAll, list1: " + list1); 
        list1.removeAll(list2);
        System.out.println("After removeAll, list1: " + list1);
    }
}
