package thread_tut.thread_methods.prevent_thread.join;


/* join()->if the thread wants to wait for another thread to complete their task,then
    we use join method.

    Thread1 wait for Thread2 for completing the task,then after completing the task of
    Thread2 join's the Thread1.

    public final void join() throws InterruptedException
    public final synchronized void join(long millis)  throws InterruptedException
    public final synchronized void join(long millis,int nano) throws InterruptedException


*/
public class JoinMethod extends Thread{

    //t1 task
    public void run(){

        try {
            for (int i=1;i<=5;i++){
                System.out.println("child Thread : "+i);
                Thread.sleep(2000);
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    //main thread
    public static void main(String[] args) throws InterruptedException{
        JoinMethod t1=new JoinMethod();
        t1.start();

        t1.join();       //main thread stop or wait for completing t1 task

        try{
            for (int i=1;i<=5;i++){
                System.out.println("Main Thread : "+i);
                Thread.sleep(2000);
            }
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
