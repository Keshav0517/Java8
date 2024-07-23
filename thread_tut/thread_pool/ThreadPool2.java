package thread_tut.thread_pool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread{
    public void run(){
        System.out.println("Task 1");
        for (int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
class Task2 implements Runnable{
    public void run(){
        System.out.println("Task 2");
        for (int i=11;i<=20;i++){
            System.out.print(i+" ");
        }
    }
}

public class ThreadPool2 {
    public static void main(String[] args) {
//        ExecutorService executorService= Executors.newSingleThreadExecutor();

        ExecutorService executorService=Executors.newFixedThreadPool(2);

        executorService.execute(new Task1());

        executorService.execute(new Thread(new Task2()));

//        System.out.println("Task 3");
//        for (int i=21;i<=30;i++){
//            System.out.print(i+" ");
//        }
    }
}
