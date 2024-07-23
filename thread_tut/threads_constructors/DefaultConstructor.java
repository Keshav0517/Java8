package thread_tut.threads_constructors;

//Thread()
public class DefaultConstructor extends Thread {

    public void run(){
        System.out.println("Task1...");
    }

    public static void main(String[] args) {
        DefaultConstructor t1=new DefaultConstructor();
        t1.start();
    }
}


