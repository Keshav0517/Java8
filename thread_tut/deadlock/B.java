package thread_tut.deadlock;

public class B {
    public synchronized void d2(A a){
        System.out.println("Thread2 is trying to run d2 method");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Thread2 is tying to call a.last ");
        a.last();
    }

    public synchronized void last(){
        System.out.println("Thread2 last method...");
    }
}
