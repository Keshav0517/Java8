package thread_tut.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class Demo implements Runnable{
    private String name;

    Demo(String name){
        this.name=name;
    }

    public void run(){
        System.out.println("Thread started:"+name);
        try {
            Thread.sleep(5000);

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Thread End:"+name);
    }
}

public class ThreadPool extends Demo {
    ThreadPool(String name) {
        super(name);
    }


    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(5);
//        ExecutorService executorService= Executors.newSingleThreadExecutor();


        //task1
        for (int i=1;i<=10;i++){
            Runnable runnable=new ThreadPool("MyThread:"+i);
            executorService.execute(runnable);
        }


        //task2
        for (int i=11;i<=20;i++){
            Runnable runnable= new ThreadPool("Next Thread:"+i);
            executorService.execute(runnable);
        }

        executorService.shutdown();

        while (!executorService.isTerminated()){

        }
        System.out.println("Successfully done...");
    }
}
