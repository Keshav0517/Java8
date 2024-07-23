package java8_features.lambda_imp.lambda_for_threads;

public class Main {
    public static void main(String[] args){
        //we need to create a thread in main

        Runnable thread1=()->{
          //task of thread 1
          for (int i=1;i<=5;i++){
              System.out.println("i:"+i);
             try {
                 Thread.sleep(2000);
             }catch (InterruptedException ie){
                 ie.printStackTrace();
             }
          }
        };
        Thread thread=new Thread(thread1);
        thread.setName("John");
        thread.start();

        Runnable thread2=()->{
          //Task2
          for (int i=1;i<=5;i++){
              System.out.println("Hello:"+i);
              try {
                  Thread.sleep(2000);
              }catch (InterruptedException ie){
                  ie.printStackTrace();
              }
          }
        };
        Thread t=new Thread(thread2);
        t.setName("Jerry");
        t.start();
    }
}
