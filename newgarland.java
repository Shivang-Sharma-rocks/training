import java.util.Scanner;

public class newgarland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int r = sc.nextInt();
            int g = sc.nextInt();
            int b = sc.nextInt();

            int sum = r + g + b;
            int max = Math.max(r, Math.max(g, b));
            if(2 * max <= sum + 1){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        sc.close();}
}
