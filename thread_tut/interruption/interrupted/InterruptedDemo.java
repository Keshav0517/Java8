package thread_tut.interruption.interrupted;

public class InterruptedDemo extends Thread{
    public void run(){
        System.out.println("Status:"+Thread.interrupted());    //true but status will change true-false
        try {
            System.out.println("Now status:"+Thread.interrupted());  //status change
            for (int i=1;i<=5;i++){
                System.out.println(i+":child Thread");
                Thread.sleep(2000);
            }

        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InterruptedDemo t1=new InterruptedDemo();
        t1.start();
        t1.interrupt();
    }

}
