package june_11_2026;

import java.util.Scanner;
import java.util.LinkedList;
public class linkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //size of linked list
        int n=sc.nextInt();
        //create a linked list
        LinkedList<Integer> L = new LinkedList<>();
        for (int i=0;i<n;i++) {
            //insertion
            L.add(sc.nextInt());
        }
        sc.close();
        //deletion
        L.remove(3);
        //updation
        L.set(2, 6);
        System.out.println(L);
        System.out.print("Value at index 1: "+L.get(1));
    }
}
