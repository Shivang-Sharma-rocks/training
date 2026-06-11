package MAY_23_2026;

// import java.io.FileInputStream;

public class filehandling {
    public static void main(String[] args) {
        int age = 25;
        try {
            if(age < 18) {
                throw new ArithmeticException("not valid");
            }
            System.out.println("eligible");
        } catch (Exception e) {
            System.out.println("exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("process completed");
        }
    }
}
