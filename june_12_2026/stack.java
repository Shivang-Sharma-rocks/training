package june_12_2026;

import java.util.Stack;
import java.util.*;
public class stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Stack<Integer> s = new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        sc.close();
        System.out.println(s); */

        Stack<String> str = new Stack<>();
        System.out.print("no. of elements to push: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            str.push(sc.next());
        }
        sc.close();
        System.out.println(str);
        System.out.println(str.peek());
        str.pop();
        System.out.println(str);

    }
}
