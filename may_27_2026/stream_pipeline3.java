package may_27_2026;

import java.util.*;
import java.util.stream.Collectors;
public class stream_pipeline3 {
    public static void main(String[] args){
        //source of data
        List<String> rawData = List.of("apple", "banana", "kiwi","Avacado");
        //we have created a new list for holding the final list
        List<String> onlyAwords = rawData.stream()
        //intermidiate operation
                .filter(word -> word.startsWith("a") || word.startsWith("A"))
                
                .collect(Collectors.toList());
        //terminal operation
        System.out.println("Original list: " + rawData);
        System.out.println("Filtered list: " + onlyAwords);
    }
}
