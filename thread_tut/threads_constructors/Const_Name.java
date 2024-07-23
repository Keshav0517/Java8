package thread_tut.threads_constructors;

//Thread(String name)
//public class Const_Name extends Thread{
//
//    Const_Name(String name){
//        super(name);
//    }
//
//    public void run(){
//        System.out.println("Thread Task...");
//    }
//    public static void main(String[] args) {
//        Const_Name t1=new Const_Name("MyThread");
//        t1.start();
//    }
//}


//Thread(Runnable target,String name)
public class Const_Name implements Runnable{
    public void run(){
        System.out.println("Task 1");
    }

    public static void main(String[] args) {
        Const_Name t1=new Const_Name();
        Thread thread=new Thread(t1,"MyThread");
        thread.start();
    }
}