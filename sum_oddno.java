import java.util.Scanner;

public class sum_oddno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        
        System.out.println("The sum of first " + n + " odd numbers is: " + sum);
        sc.close();
    }
}
