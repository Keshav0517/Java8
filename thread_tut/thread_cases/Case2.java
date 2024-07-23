package thread_tut.thread_cases;

//Perform Single Task from Multiple Threads
public class Case2 {
    public static void main(String[] args) {
        Task1 t1=new Task1("Thread 1");
        Task1 t2=new Task1("Thread 2");
        Task1 t3=new Task1("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Task1 extends Thread{
    public Task1(String name){
        super(name);
    }

    public void run(){
        System.out.println(this.getName());
    }
}
