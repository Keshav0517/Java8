package thread_tut;

public class DaemonThread extends Thread{

    public DaemonThread(String name){
        super(name);
    }

    public void run(){
        if (Thread.currentThread().isDaemon()){
            System.out.println(getName()+":Daemon Thread");
        }
        else {
            System.out.println(getName()+":User Thread");
        }
    }


    public static void main(String[] args) {
        DaemonThread t1=new DaemonThread("Keshav");
        DaemonThread t2=new DaemonThread("Nilesh");
        DaemonThread t3=new DaemonThread("Jayesh");

        t1.start();

        t2.setDaemon(true);
        t2.start();

        t3.setDaemon(true);
        t3.start();
    }
}
