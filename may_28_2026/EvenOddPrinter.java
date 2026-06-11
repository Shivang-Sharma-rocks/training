package may_28_2026;

/* Write a java program with two threads. One thread should print even numbers from 2 to 10. The other thread should print odd numbers from 1 to 9.
Use the Thread.sleep() method to space out the printing so you can see them alternating. */

public class EvenOddPrinter  {
    public static void main(String[] args) throws InterruptedException {
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i < 10; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        oddThread.start();
        evenThread.start();      
        
        oddThread.join();
        evenThread.join();
    }
}
