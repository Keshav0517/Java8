package thread_tut;

public class Pausing extends Thread {
    public static void main(String[] args) throws InterruptedException{
        String []sleepMessage={
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (int i=0;i<sleepMessage.length;i++){
            Thread.sleep(4000);
            System.out.println(sleepMessage[i]);
        }
    }
}
