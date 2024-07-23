package java8_features.staticmethods_interface;

interface A{
    int data=20;
    public static void sayHello(){
        System.out.println("Value:"+data);
    }

}

interface B{

    public static void sayHello(){
        System.out.println("Hello from B");
    }
    public void sayBy();
}


public class Demo1 implements A,B{
    public void sayBy(){
        System.out.println("Byyy...");
    }

    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        B.sayHello();
        A.sayHello();
        demo1.sayBy();
    }
}
