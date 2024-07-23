package thread_tut.thread_methods.prevent_thread.sleep;

public class SleepMethod {
    //prototype
    //1] public static native void sleep(long millis)
    //2] public static void sleep(long millis,int nanos)
    //sleep()->it stops current running thread for specified period of time
    //IllegalArgumentException – if the value of millis is negative


    //Working in main thread
    public static void main(String[] args) throws InterruptedException {
        for (int i=1;i<=5;i++){
            Thread.sleep(4000);
            System.out.print(i+" ");
        }
    }
}
