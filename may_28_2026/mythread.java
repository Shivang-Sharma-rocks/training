package may_28_2026;

public class mythread {
    public static void main(String[] args) {
        MThread t1 = new MThread();
        MThread t2 = new MThread();
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is exiting.");
    }
}


class MThread extends Thread {
    @Override
    public void run() {
        for(int i=1 ; i<=3; i++) {
            System.out.println("Thread is running: " + i);
        }
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}
