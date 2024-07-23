package thread_tut.interruption.interrupt;

public class InterruptDemo extends Thread {
    public void run(){
        try{
            for (int i=1;i<=5;i++){
                System.out.println(i+" :child Thread");
                Thread.sleep(2000);        //sleep interrupted
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {

        InterruptDemo t1=new InterruptDemo();
        t1.start();
        t1.interrupt();
    }
}
