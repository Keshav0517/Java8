package thread_tut.thread_methods.prevent_thread.yield;

public class YieldMethod2 extends Thread{

    //first run user thread
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
        }
    }

    public static void main(String[] args) {
        YieldMethod2 t1=new YieldMethod2();
        t1.start();

        Thread.yield();   //it stops main thread,after user thread,the main thread is running
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+": "+i);
        }


    }
}
