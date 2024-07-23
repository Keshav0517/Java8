package thread_tut.thread_methods.prevent_thread.sleep;

public class SleepMethod3 extends Thread{
    public void run(){
        for (int i=1;i<=5;i++){
            try {
                System.out.println(i+":"+Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println();
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        SleepMethod3 t1=new SleepMethod3();
        t1.start();

        SleepMethod3 t2=new SleepMethod3();
        t2.start();
    }
}
