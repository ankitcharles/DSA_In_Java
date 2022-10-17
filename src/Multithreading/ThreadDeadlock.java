package Multithreading;

public class ThreadDeadlock {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World!";

        Runnable runnable = () -> {
            synchronized (str1) {
                System.out.println(Thread.currentThread().getName() + " " + "has lock on"+ " "+ str1);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                System.out.println(Thread.currentThread().getName() + " " + "waiting for" +" "+ str2 + ".....");
                synchronized (str2) {
                    System.out.println(Thread.currentThread().getName() + " " + "locked:" +" " + str2);
                }
            }
        };
        Runnable runnable1 = () -> {
            synchronized (str2) {
                System.out.println(Thread.currentThread().getName() + " " + "has lock on" +" "+ str2);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
                System.out.println(Thread.currentThread().getName() + " " + "waiting for" +" "+ str1 + ".....");
                synchronized (str1) {
                    System.out.println(Thread.currentThread().getName() + " " + "locked:" +" "+ str1);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        // Thread thread1= new Thread();
    }
}
