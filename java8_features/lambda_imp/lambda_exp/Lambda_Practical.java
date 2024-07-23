package java8_features.lambda_imp.lambda_exp;

import java.util.concurrent.Callable;

public class Lambda_Practical {
    public static void main(String[] args) {
        System.out.println("System starts...");

        //First way
//        MyInterface obj=new MyInterface_Imp();
//        obj.sayHello();

        //second way
//        MyInterface i1=new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("First child class...");
//            }
//        };
//
//        i1.sayHello();
//
//        MyInterface i2=new MyInterface() {
//            @Override
//            public void sayHello() {
//                System.out.println("Second child class...");
//            }
//        };
//        i2.sayHello();

        //Lambda
        MyInterface i1=()->{
            System.out.println("First Lambda...");
        };
        i1.sayHello();

        MyInterface i2=()->{
            System.out.println("Second Lambda...");
        };
        i2.sayHello();


    }
}
