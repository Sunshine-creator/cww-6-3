package CWW603;

public class Test {
    private static class MyRunnable implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("通过异常收到了情况！！！！");
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().isInterrupted());  //调用方法进行中断
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable,"李四");
        thread.start();
        thread.interrupt();
    }
}
