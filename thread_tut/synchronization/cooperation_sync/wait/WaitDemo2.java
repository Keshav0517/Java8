package thread_tut.synchronization.cooperation_sync.wait;

public class WaitDemo2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread();
        t1.start();

        //main thread sleep for 10 sec, after 10 sec it print only "main thread is trying to invoke wait()..."
        Thread.sleep(10000);

        synchronized (t1){
            System.out.println("main thread is trying to invoke wait()...");

            //main thread goes inside waiting state unit another thread is invoke notify(),notifyAll() for this object
            //Now main thread is in waiting state forever
            //to overcome these problem use wait(10000)
            //t1.wait();
            t1.wait(10000);

        }
        System.out.println("main thread is invoked from waiting state...");
        System.out.println("total:"+t1.total);
    }
}

class MyThread extends Thread{
    int total=0;
    public void run(){
        System.out.println("child thread start calculation...");
        for (int i=1;i<=100;i++){
            total=total+i;
        }
        synchronized (this){
            System.out.println("child thread is trying to notify the main thread...");
            this.notify();
        }
    }
}