package may_25_2026;

import java.util.*;
public class setExample {
    public static void main(String[] args){
        Set<String> cars1 = new HashSet<>();
        Set<String> cars2 = new TreeSet<>();

        //adding values in hashset
        cars1.add("maruti");
        cars1.add("kia");
        cars1.add("Maruti");
        cars1.add("kia");
        cars1.add("toyota");
        cars1.add("Volvo");

        //adding values in treeset
        cars2.add("maruti");
        cars2.add("kia");
        cars2.add("Maruti");
        cars2.add("kia");
        cars2.add("toyota");
        cars2.add("Volvo");

        System.out.println("Cars in HashSet: " + cars1);
        System.out.println("Cars in TreeSet: " + cars2);

        //checking if a specific element is present
        if(cars1.contains("kia")){
            System.out.println("kia is present ");
        } else {
            System.out.println("kia is not present ");
        }

        if(cars1.contains("Volvo")){
            System.out.println("Volvo is present ");
        } else {
            System.out.println("Volvo is not present ");
        }

        //for -each loop
        for(String car : cars1){
            System.out.println("Car in HashSet: " + car);
        }

        for(String car : cars2){
            System.out.println("Car in TreeSet: " + car);
        }

        //removing an element
        cars1.remove("Maruti");
        System.out.println("HashSet after removal: " + cars1);

        
    }
}
