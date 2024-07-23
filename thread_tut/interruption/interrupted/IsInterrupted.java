package thread_tut.interruption.interrupted;

public class IsInterrupted extends Thread{
    public void run(){
        System.out.println("interrupted status:"+Thread.interrupted());
        System.out.println("Check:"+isInterrupted());   //true
        try{
            for (int i=1;i<=5;i++){
                System.out.println(i+":child Thread");
                Thread.sleep(2000);
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public static void main(String[] args){
        IsInterrupted t1=new IsInterrupted();
        t1.start();
        t1.interrupt();
    }
}
