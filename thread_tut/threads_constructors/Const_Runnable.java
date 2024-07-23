package thread_tut.threads_constructors;

//Constructor by passing Runnable interface
//Thread(Runnable target)

public class Const_Runnable implements Runnable{
    public void run(){
        System.out.println("Thread Task..");
    }

    public static void main(String[] args) {
        Const_Runnable t1=new Const_Runnable();
        Thread thread=new Thread(t1);
        thread.start();
    }
}
