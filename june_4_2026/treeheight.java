package june_4_2026;

import java.util.Scanner;
public class treeheight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] >count){
                count = arr[i];
            }
        }
        sc.close();
        int height = 0;
        for(int i=0;i<count;i++){
            for(int j=0;j<n;j++){
                height += arr[j]-i;
                if(height == x){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
