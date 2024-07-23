package thread_tut.daemon_thread;

public class DaemonThread extends Thread {
    public void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println("daemon thread...");
        }else
            System.out.println("child thread...");
    }

    public static void main(String[] args) {
        //Thread.currentThread().setDaemon(true);  //RTE:IllegalThreadStateException
        System.out.println("main thread...");
        DaemonThread t1=new DaemonThread();
        //t1.start();                         RTE:IllegalThreadStateException
        t1.setDaemon(true);
        t1.start();
    }
}
