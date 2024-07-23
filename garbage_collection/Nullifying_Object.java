package garbage_collection;

public class Nullifying_Object {
    @Override
    public void finalize(){
        System.out.println("GC...");
    }

    public void message(){
        System.out.println("message...");
    }

    public static void main(String[] args){
        Nullifying_Object obj1=new Nullifying_Object();
        Nullifying_Object obj2=new Nullifying_Object();
        Nullifying_Object obj3=new Nullifying_Object();

        System.out.println("Before Nullifying Objects");
        obj1.message();
        obj2.message();
        obj3.message();

        obj1=null;
        obj3=null;

        System.out.println("After Nullifying Objects....");
        obj2.message();


        System.gc();

    }
}
