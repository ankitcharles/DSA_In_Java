package Multithreading;

public class ThreadExample {
    public static void main(String[] args) {

        // thread with anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<10;i++){
                    System.out.println("Thread: " +i);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        // create a thread via lambda expression
        Runnable runnable1 = ()->{
            for(int i=0;i<10;i++){
                System.out.println("Thread in lambda: " +i);
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }
}
