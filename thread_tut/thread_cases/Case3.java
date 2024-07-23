package thread_tut.thread_cases;

public class Case3 {
    public static void main(String[] args) {
        Task t1=new Task();
        Task2 t2=new Task2();
        Task3 t3=new Task3();

        t1.start();
        t2.start();
        t3.start();
    }
}


class Task extends Thread{
    public void run(){
        System.out.println("Task1");
    }
}

class Task2 extends Thread{
    public void run(){
        System.out.println("Task2");
    }
}

class Task3 extends Thread{
    public void run(){
        System.out.println("Task3");
    }
}
