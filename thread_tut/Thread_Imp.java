package thread_tut;

//public class Thread_Imp implements Runnable {
//    public void run(){
//        System.out.println("Thread running..");
//    }
//
//    public static void main(String[] args) {
//        Thread_Imp t1=new Thread_Imp();
//        Thread thread=new Thread(t1);
//        thread.start();
//    }
//
//}


//public class Thread_Imp extends Thread {
//    public void run(){
//        System.out.println("Thread running..");
//    }
//
//    public static void main(String[] args) {
//        Thread_Imp t1=new Thread_Imp();
//        t1.start();
//    }
//
//}


public class Thread_Imp {
    public static void main(String[] args) {
        Thread t1=new Thread("Thread");
        t1.start();

        String s=t1.getName();
        System.out.println(s);
    }

}
