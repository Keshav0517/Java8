package thread_tut.deadlock.realtime;

public class DeadLock {

    public static void main(String[] args) {

        final String resource1="Printer";
        final String resource2="Scanner";

         Runnable run1=()->{  //thread1 locked resource1,but thread1 access resource2
            synchronized (resource1){
                System.out.println(Thread.currentThread().getName()+":locked"+resource1);
                try {
                    Thread.sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }

                synchronized (resource2){   //thread2 locked by resource2
                    System.out.println(Thread.currentThread().getName()+":locked"+resource2);
                }

            }

        };

         Runnable run2=()->{
            synchronized (resource2){
                System.out.println(Thread.currentThread().getName()+":locked"+resource2);
                try {
                    Thread.sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();
                }

                synchronized (resource1){
                    System.out.println(Thread.currentThread().getName()+":locked"+resource1);
                }

            }

        };


        Thread thread1=new Thread(run1);
        thread1.setName("Desktop");

        Thread thread2=new Thread(run2);
        thread2.setName("Laptop");

        thread1.start();
        thread2.start();
    }
}
