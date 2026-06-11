package may_28_2026;

class MRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=1 ; i<=3; i++) {
            System.out.println("Runnable thread is running: " + i);
        }
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println("Runnable thread interrupted: " + e.getMessage());
        }
    }
}
public class myrunnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MRunnable());
        Thread t2 = new Thread(new MRunnable());
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();   
        }
    }
}
