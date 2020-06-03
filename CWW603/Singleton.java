package CWW603;

public class Singleton {
//    private  static Singleton instance = new Singleton(); //饿汉模式
//
//    public Singleton() {
//    }
//    public  static Singleton getInstance(){
//        return instance;
//    }
//private  static Singleton instance = null; //懒汉模式
//
//    public Singleton() {
//    }
//    public  static Singleton getInstance(){
//        if(instance==null){
//            instance = new Singleton();
//        }
//        return instance;
//    }
//private  static Singleton instance = null; //懒汉模式多线程
//
//    public Singleton() {
//    }
//    public synchronized static Singleton getInstance(){
//        if(instance==null){
//           instance = new Singleton();
//        }
//        return instance;
//    }
private  static Singleton instance = null; //懒汉模式多线程

    public Singleton() {
    }
    public synchronized static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
