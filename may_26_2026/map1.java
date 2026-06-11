package may_26_2026;

import java.util.*;

public class map1 {
        public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(5);
        list1.add(6);
        list1.add(2);
        list1.add(4);
        list1.add(4);
        list1.add(2);
        list1.add(3);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(1);
        list1.add(4);
        list1.add(5);
        Set<Integer> set1 = new HashSet<>(list1);
        System.out.println("List: " + list1);
        System.out.println("Set: " + set1);

        //frequency of each element in the list
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        /* for (Integer num : list1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        } */
            for (Integer num : list1) {
                if (frequencyMap.containsKey(num)) {
                    frequencyMap.put(num, frequencyMap.get(num) + 1);
                } else {
                    frequencyMap.put(num, 1);
                }
            }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
