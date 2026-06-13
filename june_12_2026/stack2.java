package june_12_2026;

import java.util.Stack;
import java.util.Scanner;
public class stack2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s =new Stack<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
/*         s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5); */
        System.out.println(s);
        System.out.println("enter the index and elements to add: ");
        int index =sc.nextInt();
        int element =sc.nextInt();
        s.add(index, element);
        // s.add(0,10);
        System.out.println(s);
        sc.close();
    }
}
