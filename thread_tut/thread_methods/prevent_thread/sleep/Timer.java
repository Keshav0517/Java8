package thread_tut.thread_methods.prevent_thread.sleep;

public class Timer extends Thread{
    public void run(){
        int count=0;
        try {
            for (int i=0;i<60;i++){
                Thread.sleep(1000);
                if (i==59){
                    count++;
                }
            }
            int time=count;
            System.out.println("time:"+time);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Timer t1=new Timer();
        t1.start();
    }

}
