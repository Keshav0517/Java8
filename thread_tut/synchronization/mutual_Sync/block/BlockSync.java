package thread_tut.synchronization.mutual_Sync.block;

import java.util.Scanner;

public class BlockSync extends Thread {
    static Student s;
    int roll;
    String name;
    public void run(){
        s.marksDetail();
//        Student.calculatePercentage();
        s.studentDetail(roll,name);
    }

    public static void main(String[] args) throws InterruptedException{
        s=new Student();

        //Thread 1
        BlockSync s1=new BlockSync();
        s1.roll=12;
        s1.name="Jayesh";
        s1.start();


        BlockSync s2=new BlockSync();
        s2.roll=23;
        s2.name="Keshav";
        s2.start();




    }

}

class Student {
    int rollNo;
    String name;

    static int marksObtained;
    static int totalMarks;
    static float percentage;


    public static void calculatePercentage(){
        percentage=((float) marksObtained /totalMarks)*100;
    }

    public synchronized void marksDetail(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marksObtained:");
        marksObtained=sc.nextInt();
        System.out.println("Enter totalMarks:");
        totalMarks=sc.nextInt();
        calculatePercentage();
    }

    public void studentDetail(int rollNo,String name){
        //Synchronized Block(this)->this is used to refer current class object
        synchronized (this){
            System.out.println("Name:"+name);
            System.out.println("Marks Obtained:"+marksObtained);
            System.out.println("Percentage:"+percentage+"%");
        }

    }

}
