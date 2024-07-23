package java8_features.defaultmethods_interface;

interface A{
    default void sayHello(){
        System.out.println("Hello from A");
    }
}

interface B{
    default void sayHello(){
        System.out.println("Hello from B");
    }
}


public class Demo2 implements A,B{
    public static void main(String[] args) {
        Demo2 demo2=new Demo2();
        demo2.sayHello();
    }

    @Override
    public void sayHello(){
        B.super.sayHello();
    }
}
