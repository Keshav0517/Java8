package thread_tut.thread_group;

class ThreadGroupDemo implements Runnable{
    public void run(){
        System.out.println("Current Thread:"+Thread.currentThread().getName());
    }
}


public class Demo {
    public static void main(String[] args) {
        ThreadGroupDemo demo=new ThreadGroupDemo();

        ThreadGroup group1=new ThreadGroup("Parent Thread Group");

        Thread t1=new Thread(group1,demo,"Nilesh");
        Thread t2=new Thread(group1,demo,"Jayesh");
        Thread t3=new Thread(group1,demo,"jd");

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Active Threads:"+group1.activeCount());
        System.out.println("Active Group Count:"+group1.activeGroupCount());

        ThreadGroup group2=new ThreadGroup("Child Thread Group");
        Thread t4=new Thread(group2,demo,"Kunal");
        Thread t5=new Thread(group2,demo,"Manoj");

        t4.start();
        t5.start();



    }
}
