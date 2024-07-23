package thread_tut.thread_methods.prevent_thread.join;

public class JoinMethod2 extends Thread{

    //we want's to stop user thread
    static Thread t;         //reference t
    public void run(){

        try {
            t.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

        try {
            for (int i=1;i<=5;i++){
                System.out.println("child Thread:"+i);
                Thread.sleep(2000);
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    //main thread
    public static void main(String[] args) {
        JoinMethod2 t1=new JoinMethod2();
        t1.start();

        t=Thread.currentThread();       //get Current Thread reference

        try {
            for (int i=1;i<=5;i++){
                System.out.println("main Thread:"+i);
                Thread.sleep(2000);
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
