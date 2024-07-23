package thread_tut.priority;

public class Priority extends Thread {
    public void run(){
        System.out.println("child thread priority:"+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        Priority t1=new Priority();

        Thread.currentThread().setPriority(MAX_PRIORITY);

        System.out.println("main thread priority:"+Thread.currentThread().getPriority());
        t1.setPriority(6);
        //t1.setPriority(15);        //IllegalArgumentException , priority-> 15>10
        t1.start();
    }

}


//t1.setPriority(15);        //IllegalArgumentException , priority > 10
//t1.setPriority(0);        //IllegalArgumentException , priority < 1
//t1.setPriority(-1);        //IllegalArgumentException , priority < 0