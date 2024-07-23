package thread_tut.thread_methods.basic;

//public class BasicMethods{
//    public static void main(String[] args) {
//        System.out.println("Current Thread:"+Thread.currentThread().getName());
//        Thread.currentThread().setName("MyThread");
//        System.out.println("Current Thread:"+Thread.currentThread().getName());
//    }
//}

public class BasicMethods extends Thread{

    public void run(){
        System.out.println("run method executed by:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Current Thread:"+Thread.currentThread().getName());
        BasicMethods t1=new BasicMethods();
        t1.start();

        System.out.println("Alive:"+t1.isAlive());
    }
}