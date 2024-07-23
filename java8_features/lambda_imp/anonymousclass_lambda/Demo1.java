package java8_features.lambda_imp.anonymousclass_lambda;


interface MyInterface{
    public void sayHello();
    public void sayBy();
}

public class Demo1 implements MyInterface {
    public static void main(String[] args) {
        Demo1 d=new Demo1();
        MyInterface myInterface=new MyInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous inner class...");
            }

            @Override
            public void sayBy() {
                System.out.println("By from anonymous inner class...");
            }
        };

        myInterface.sayHello();
        myInterface.sayBy();

        d.sayHello();
        d.sayBy();
    }

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void sayBy() {
        System.out.println("Byyy");
    }
}
