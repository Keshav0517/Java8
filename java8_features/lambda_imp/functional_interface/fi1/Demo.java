package java8_features.lambda_imp.functional_interface.fi1;

@FunctionalInterface
interface MyInterface{
    public void sayHello();   //abstract method

    //public int sum(int a,int b); //abstract method

    default int sum(int a,int b){
        return a+b;
    }

    default int multi(int x,int y){
        return x*y;
    }

    public static void message(){
        System.out.println("End...");
    }

}

public class Demo implements MyInterface {
    public void sayHello() {
        System.out.println("Hello..");
    }

//    public int sum(int a,int b){
//        return a+b;
//    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.sayHello();

//     int res=d.sum(10,5);
//        System.out.println("Sum:"+res);
//    }
        int r = d.sum(10, 5);
        System.out.println("sum:" + r);

        int r1=d.multi(5,2);
        System.out.println("Multiply:"+r1);

        MyInterface.message();    //static method
    }
}
