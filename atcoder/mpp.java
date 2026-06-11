package atcoder;

import java.util.Scanner;
import java.util.HashMap;
public class mpp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        int max = charCount.values().stream().max(Integer::compare).orElse(0);
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (charCount.get(c) != max) {
                result.append(c);
            }
        }
        System.out.println(result.toString());
    }
}
