package thread_tut.thread_methods.prevent_thread.yield;


public class YieldMethod extends Thread{
    /*
    public static native void yield()
    yield()->It stop the current running thread/or stop itself and allow other threads for
    Execution.

    working->
    java 5:sleep() is used internally in yield
    java 6:Thread provides the hint to thread scheduler to stop running thread,depends on thread
    scheduler to accept their hint or not.

    */

    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    //first run main thread
    public static void main(String[] args) {
        YieldMethod t1=new YieldMethod();
        t1.start();

        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }

    }
}
