package java8_features.defaultmethods_interface;


interface MyInterface{
//    public void sayHello();
    default void sayHello(){
        System.out.println("Hello");
    }
}

class Child1 implements MyInterface{
    @Override
    public void sayHello() {
        MyInterface.super.sayHello();
    }

    //    public void sayHello(){
//        System.out.println("Hello");
//    }
}

class Child2 implements MyInterface{
    @Override
    public void sayHello() {
        System.out.println("Hello From Child2");
    }

    //    public void sayHello(){
//        System.out.println("Hello");
//    }
}

public class Demo1 {
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.sayHello();

        Child2 child2=new Child2();
        child2.sayHello();
    }
}
