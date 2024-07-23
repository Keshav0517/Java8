package thread_tut.thread_pool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
    private int number;
    Task(int number){
        this.number=number;
    }

    public void run(){
        System.out.println("\nTask:"+number+":started");
        for (int i=number*10;i<=number*10+9;i++){
            System.out.print(i+" ");
        }
        System.out.println("\nTask:"+number+":End");
    }
}


public class ThreadPool3 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);
        service.execute(new Task(1));
        service.execute(new Task(2));
        service.execute(new Task(3));
        service.execute(new Task(4));
        service.execute(new Task(5));
        service.execute(new Task(6));
        service.execute(new Task(7));
        service.execute(new Task(8));
    }
}
