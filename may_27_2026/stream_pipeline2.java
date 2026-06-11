package may_27_2026;

import java.util.*;
public class stream_pipeline2 {
    public static void main(String[] args){
        //source of data
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        System.out.println("Keeping only even numbers in the pipeline...");
        //starting of conveyor belt
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);
    }
}
