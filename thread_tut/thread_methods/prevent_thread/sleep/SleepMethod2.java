package thread_tut.thread_methods.prevent_thread.sleep;

public class SleepMethod2 extends Thread{
    //Working in user thread
    public void run(){
        for (int i=1;i<=5;i++){
            try {
                Thread.sleep(4000);
                //Thread.sleep(-1);         RTE:IllegalArgumentException
                //Thread.sleep(4000,-1);    RTE:IllegalArgumentException
                System.out.println(i);
            }catch (InterruptedException ie){      //CTE:InterruptedException
                ie.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SleepMethod2 t1=new SleepMethod2();
        t1.start();
    }
}
