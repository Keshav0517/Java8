package java8_features.lambda_imp.lambda_var;


interface MyInterface{
    void m1();
    default void message(){
        System.out.println("message from Interface...");
    }
}
public class Main {
    int data=100;    //instance var
    public static void main(String[] args) {
        Main m=new Main();
        MyInterface i=()->{
            System.out.println("Data:"+m.data);
            m.data=m.data+150;
            System.out.println("Data:"+m.data);
        };
        i.m1();

        m.data=m.data+50;
        System.out.println("Data:"+m.data);

        i.message();
    }
}
