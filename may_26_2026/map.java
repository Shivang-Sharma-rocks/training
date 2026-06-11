package may_26_2026;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Dheeraj",12);
        students.put("Rohit", 15);
        students.put("Suresh", 11);
        students.put("Dheeraj", 20); 
        students.put("Rohit", 18);
        System.out.println("Students: " + students);
        System.out.println("value at key Dheeraj: " + students.get("Dheeraj"));

        //iterating a map
        for(Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
    }
}
