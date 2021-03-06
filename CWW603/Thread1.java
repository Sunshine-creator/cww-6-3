package CWW603;

import java.util.Random;

public class Thread1 {
    private static class MyThread extends Thread {
        @Override
        public void run() {
            Random random = new Random();
            while (true){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(random.nextInt(200));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
            MyThread t1 = new MyThread();
            MyThread t2 = new MyThread();
            MyThread t3 = new MyThread();
            t1.start();
            t2.start();
            t3.start();
            Random random = new Random();
            while (true){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(random.nextInt(200));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
