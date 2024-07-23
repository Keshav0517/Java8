package thread_tut;

public class DeadLock_SingleThread extends Thread {
    public static void main(String[] args) {
        try {
            System.out.println("Enter into DeadLock..");
            Thread.currentThread().join();
            System.out.println("Unreachable...");
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
