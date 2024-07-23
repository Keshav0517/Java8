package thread_tut.synchronization.cooperation_sync.wait;

public class WaitDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread1 thread1=new Thread1();
        thread1.start();
//        Thread.sleep(0,1);
//        thread1.join();

        synchronized (thread1){
            System.out.println("main thread is trying to invoke wait()");
            thread1.wait();
        }
        System.out.println("main thread invoke from waiting state...");
        System.out.println("Total:"+thread1.total);
    }
}

class Thread1 extends Thread{
    int total=0;
    public void run(){
        System.out.println("child thread start calculation..");
        for (int i=1;i<=100;i++){
            total=total+i;
        }
        synchronized (this){
            System.out.println("child thread trying to notify main thread...");
            this.notify();
        }
    }
}