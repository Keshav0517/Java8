package thread_tut.deadlock;

public class A {
    public synchronized void d1(B b){
        System.out.println("Thread1 is trying to run d1 method..");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println("Thread1 is trying to call b.last ");
        b.last();
    }

    public synchronized void last(){
        System.out.println("Thread1 executes last method..");
    }
}
