package java8_features.lambda_imp.functional_interface.fi2;

interface Parent{
    public void sayHello();
}

//case 1

//@FunctionalInterface
//interface Child extends Parent{   //Functional Interface
//
//}

//case 2
//interface Child extends Parent{    // Not Functional Interface
//    public void sayBy();           //Two abstract method 1->sayBy() 2->sayHello()
//}


//case 3

@FunctionalInterface
interface Child extends Parent{

    public void sayHello();      //method override /same method

    default void sayBy(){
        System.out.println("Byy...");
    }

    public static void print(){
        System.out.println("Static method from Child Interface");
    }
}


public class Demo implements Child{
    public void sayHello(){
        System.out.println("Hello...");
    }


//    public void sayBy(){
//        System.out.println("Byy...");
//    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.sayHello();
        d.sayBy();

        Child.print();
    }
}
