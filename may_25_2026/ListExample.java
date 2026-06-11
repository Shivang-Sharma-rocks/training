package may_25_2026;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
/*      List<String> Codelanguages = new ArrayList<>();

        //adding elements to the list
        Codelanguages.add("Java");
        Codelanguages.add("Python");
        Codelanguages.add("C++");

        //adding at a specific index
        Codelanguages.add(1, "JavaScript");
        Codelanguages.add(0, "Ruby");

        //Displaying the list
        System.out.println("Code languages: " + Codelanguages);
        System.out.println("First code language: " + Codelanguages.get(0));

        //replacing an element
        Codelanguages.set(2, "Anaconda");
        System.out.println("Updated list: " + Codelanguages);

        //removing an element
        Codelanguages.remove("Anaconda");
        Codelanguages.remove(0);
        System.out.println("List after removal: " + Codelanguages);

        //sorting the list
        //Collections.sort(Codelanguages);
        Codelanguages.sort(null);
        System.out.println("Sorted list: " + Codelanguages);
        System.out.println("Size of the list: " + Codelanguages.size());

        //display using for-each loop
        for(String language : Codelanguages) {
            System.out.println("Language at index " + Codelanguages.indexOf(language) + ": " + language);
        }
*/      List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        System.out.println("Numbers: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled numbers: " + numbers);
        numbers.sort(null);
        System.out.println("Sorted numbers: " + numbers);

        for(Integer num : numbers){
            System.out.println("Number at index " + numbers.indexOf(num) + ": " + num);
        }
        for(Integer num : numbers){
            System.out.print(num+" ");
        }
    }
}
