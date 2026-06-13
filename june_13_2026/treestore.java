package june_13_2026;

import java.util.ArrayList;
import java.util.*;
public class treestore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=7;
        int m=6;
        @SuppressWarnings("unchecked")
        ArrayList<Integer> arr[] = new ArrayList[n+1];
        for(int i=0;i<n+1;i++){
            arr[i] = new ArrayList<Integer>();
        }

        for(int i=0;i<m;i++){
            int u ,v;
            u= sc.nextInt();
            v = sc.nextInt();

            arr[u].add(v);
            arr[v].add(u);
        }
        sc.close();
        for(int i=1;i<n+1;i++){
            System.out.print("for node "+i+": ");
            for(Integer z: arr[i]){
                System.out.print(z);
            }
            System.out.println();
        }

    }
}
