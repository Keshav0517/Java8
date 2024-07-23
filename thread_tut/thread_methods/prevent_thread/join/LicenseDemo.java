package thread_tut.thread_methods.prevent_thread.join;

class Medical extends Thread{    //Thread  1
    static Thread t;
    public void run(){
        try {
            System.out.println("Medical Start...");
            Thread.sleep(3000);
            System.out.println("Medical Completed.");
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}

class TestDrive extends Thread{    //Thread 2
    Thread t=Thread.currentThread();
    public void run(){
        try {
            System.out.println("Start Driving...");
            Thread.sleep(5000);
            System.out.println("End Driving.");
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}

class DocSign extends Thread{    //Thread 3
    public void run(){
        try {
            System.out.println("Document Verification Start...");
            Thread.sleep(3000);
            System.out.println("Document Signature Completed.");
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}

public class LicenseDemo {
    public static void main(String[] args) throws InterruptedException{
        Medical t1=new Medical();
        t1.start();

        t1.join();

        TestDrive t2=new TestDrive();
        t2.start();

        t2.join();

        DocSign t3=new DocSign();
        t3.start();


    }
}
