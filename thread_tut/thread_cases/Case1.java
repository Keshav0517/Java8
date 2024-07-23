package thread_tut.thread_cases;


//Perform Single task from Single Thread
public class Case1 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Single Task..");
    }
}
