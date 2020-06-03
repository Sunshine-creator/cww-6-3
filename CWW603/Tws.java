package CWW603;

public class Tws {
    private static class Counter {
        //        private  int n1 =0;
//        private  int n2 =0;
//        private  int n3 =0;
//        private  int n4 =0;
//        private  int n5 =0;
//        private  int n6 =0;
//        private  int n7 =0;
//        private  int n8=0;
//        private  int n9 =0;
//        private  int n10 =0;
//        public void write(){
//            n1=1;
//            n2=2;
//            n3=3;
//            n4 =4;
//            n5=5;
//            n6=6;
//            n7=7;
//            n8=8;
//            n9=9;
//            n10=10;
//        }
//        public void read(){
//            System.out.println("n1="+n1);
//            System.out.println("n2="+n2);
//            System.out.println("n3="+n3);
//            System.out.println("n4="+n4);
//            System.out.println("n5="+n5);
//            System.out.println("n6="+n6);
//            System.out.println("n7="+n7);
//            System.out.println("n8="+n8);
//            System.out.println("n9="+n9);
//            System.out.println("n10="+n10);
//        }
//    }
//    public static void main(String[] args) {
//        Counter counter = new Counter();
//        Thread t1 = new Thread(()->{
//           counter.read();
//        },"读");
//        Thread t2 = new Thread(()->{
//
//        },"写");
//        t1.start();
//        t2.start();
//    }
//        private  long n=0;
//        public  void increment(){
//            n++;
//        }
//        public  void decrement(){
//            n--;
//        }
//        public long value(){
//            return n;
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        final  int COUNT = 10;
//        Counter counter = new Counter();
//        Thread t1 = new Thread(()->{
//            for (int i = 0; i < COUNT; i++) {
//                counter.increment();
//            }
//        },"李四");
//        t1.start();
//        for (int i = 0; i < COUNT; i++) {
//            counter.decrement();
//        }
//        t1.join();
//        System.out.println(counter.value());
//    }
//private  long n=0;
//        public synchronized void increment(){
//            n++;
//        }
//        public synchronized void decrement(){
//            n--;
//        }
//        public long value(){
//            return n;
//        }
//    }
//    public static void main(String[] args) throws InterruptedException {
//        final  int COUNT = 10;
//        Counter counter = new Counter();
//        Thread t1 = new Thread(()->{
//            for (int i = 0; i < COUNT; i++) {
//                counter.increment();
//            }
//        },"李四");
//        t1.start();
//        for (int i = 0; i < COUNT; i++) {
//            counter.decrement();
//        }
//        t1.join();
//        System.out.println(counter.value());
//    }
        static class MyThread implements Runnable {
            private int ticket = 10;

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {//同一时刻只允许一个进程进入代码块
                    synchronized (this) {
                        if (this.ticket > 0) {
                            try {
                                Thread.sleep(20);                      //
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            System.out.println(Thread.currentThread().getName() + ",还有" + this.ticket-- + "张票！");
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Counter.MyThread myThread = new Counter.MyThread();
                Thread t1 = new Thread(myThread,"黄牛a");
                Thread t2 = new Thread(myThread,"黄牛b");
                Thread t3 = new Thread(myThread,"黄牛c");
                t1.start();
                t2.start();
                t3.start();
    }
}




