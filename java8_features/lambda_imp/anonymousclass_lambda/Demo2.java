package java8_features.lambda_imp.anonymousclass_lambda;

interface MyInter{
    public void sayHello();    //single abstract method

    default void sayBy(){
        System.out.println("Byy from Interface...");
    }

}
public class Demo2 implements MyInter{
    public static void main(String[] args) {
        Demo2 d=new Demo2();
        MyInter inter=()-> System.out.println("Hello using lambda...");
        inter.sayHello();
        inter.sayBy();

        d.sayHello();
    }

    @Override
    public void sayHello() {
        System.out.println("Hello...");
    }
}
