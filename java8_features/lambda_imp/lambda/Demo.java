package java8_features.lambda_imp.lambda;

public class Demo {
    private void fun(){
        System.out.println("Hello..");
    }

    //()->System.out.println("Hiii");


    private int show(int a){
        return a;
    }

    //(int a)->return a;

    private int sum(int a,int b){
        return a+b;
    }

    // (a,b)->a+b;

    private String nameUser(String name){
        return name;
    }

    //(name)->name

    public static void main(String[] args) {
        Demo d=new Demo();
        d.fun();
    }
}
