package garbage_collection;

public class Reassign_References {
    public void finalize(){
        System.out.println("GC....");
    }

    public void message(){
        System.out.println("message...");
    }
    public static void main(String[] args) {
        Reassign_References obj1=new Reassign_References();
        Reassign_References obj2=new Reassign_References();
        Reassign_References obj3=new Reassign_References();

        System.out.println("Before Reassigning objects...");
        obj1.message();
        obj2.message();
        obj3.message();

        obj1=new Reassign_References();    //reassign eligible for gc
        obj2=obj1;      //reassign obj2 ,eligible for gc

        System.out.println("After reassigning objects...");
        obj1.message();
        obj2.message();

        System.gc();

    }
}
