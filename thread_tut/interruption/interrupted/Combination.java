package thread_tut.interruption.interrupted;

public class Combination extends Thread{
    public void run(){
        System.out.println("child thread:"+Thread.currentThread().isInterrupted());
        System.out.println("Interrupted status:"+Thread.interrupted());   //true status change
        //System.out.println("Is_Interrupted status:"+isInterrupted());     //false
        try{
            for (int i=1;i<=5;i++){
                System.out.print(i+" ");
                Thread.sleep(2000);
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Combination t1=new Combination();
        System.out.println("main thread:"+Thread.interrupted());
        t1.start();
        t1.interrupt();
    }
}
