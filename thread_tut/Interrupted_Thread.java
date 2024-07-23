package thread_tut;

public class Interrupted_Thread extends Thread{
    public void run(){
//        try {
//            Thread.sleep(2000);
//            System.out.println("Thread running...");
//        }catch (InterruptedException ie){
//            throw new RuntimeException("Exception"+"interrupted");
//        }

        for (int i=0;i<5;i++){
            System.out.println(i);
        }


    }
    public static void main(String[] args) {
        Interrupted_Thread t1=new Interrupted_Thread();
        t1.start();

//        try {
//            t1.interrupt();
//        }catch (Exception e){
//            System.out.println("Exception Handled..");
//        }

        t1.interrupt();

        if (t1.isInterrupted()){
            throw new RuntimeException("Exception Interrupted");
        }
    }
}
