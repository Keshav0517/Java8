package thread_tut.deadlock.realtime;

//Amy-->Oil(locked)
//Adam-->Pen(locked)
//Amy->Pen
//Adam->Oil

public class DeadLock2 {
    static final String resource1="Oil";
    static final String resource2="Pen";

   static Runnable runnable1=()->{
      synchronized (resource1){
          System.out.println(Thread.currentThread().getName()+":locked->"+resource1);
          try {
              Thread.sleep(2000);
          }catch (InterruptedException ie){
              ie.printStackTrace();
          }

          synchronized (resource2){
              System.out.println(Thread.currentThread().getName()+":locked-"+resource2);
          }
      }

    };

   static Runnable runnable2=()->{
        synchronized (resource2){
            System.out.println(Thread.currentThread().getName()+":locked-"+resource2);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }

            synchronized (resource1){
                System.out.println(Thread.currentThread().getName()+":locked-"+resource2);
            }
        }

    };

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(runnable1);
        t1.setName("Amy");

        Thread t2=new Thread(runnable2);
        t2.setName("Adam");

        t1.start();
        t2.start();
    }


}
