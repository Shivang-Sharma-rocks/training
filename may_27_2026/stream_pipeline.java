package may_27_2026;

import java.util.*;

public class stream_pipeline {
    public static void main(String[] args){
        //Source of data
        List<Integer> numbers = List.of(5,12,8,20);

        System.out.println("Starting the pipeline...");
        //starting of conveyor belt
        numbers.stream()

        //intermediate operation
                .filter(num -> num>10)

                //terminal operation
                .forEach(winner -> System.out.println(winner + " is a winner!"));

    }
}
