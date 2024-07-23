package thread_tut;

public class CurrentThread extends Thread{

    CurrentThread(String name){
        super(name);
    }

    public void run(){
        System.out.println("Current Thread:"+Thread.currentThread().getName());

        System.out.println();

        System.out.println("Thread name:"+this.getName());
        System.out.println("Priority:"+this.getPriority());

        System.out.println();

        this.setPriority(6);

        System.out.println("New Priority:"+this.getPriority());
        System.out.println("Id:"+this.getId());
        System.out.println("State:"+this.getState());
        System.out.println("Thread Group:"+this.getThreadGroup());


    }

    public static void main(String[] args) {
        CurrentThread t1=new CurrentThread("Thread 1");
        CurrentThread t2=new CurrentThread("Thread 2");

        t1.start();
        t2.start();

        t1.setPriority(7);

        t2.setName("Keshav");
    }
}
