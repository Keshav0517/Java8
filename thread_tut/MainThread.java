package thread_tut;

public class MainThread  extends Thread{
    public static void main(String[] args) {
        Thread t1=new Thread();
        System.out.println("Main Thread:"+currentThread().getName());
        System.out.println("Priority:"+currentThread().getPriority());

        t1.setName("Nilesh");
        System.out.println("Thread Name:"+t1.getName());
        System.out.println("Priority:"+t1.getPriority());

        for (int i=0;i<3;i++){
            try {
                Thread.sleep(4000);
                System.out.print(i+" ");
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }

        }

    }
}
