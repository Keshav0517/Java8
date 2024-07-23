package garbage_collection;

public class Object_Method {

    public void finalize(){
        System.out.println("GC...");
    }
    public static Object_Method m1(){
        Object_Method obj1=new Object_Method();
        Object_Method ob2=new Object_Method();
        return obj1;
    }

    //case 1
    public static void main(String[] args) {
        Object_Method o=m1();
        System.gc();
    }
}


