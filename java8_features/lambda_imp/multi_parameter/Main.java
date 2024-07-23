package java8_features.lambda_imp.multi_parameter;

interface MyInterface{
    void multiply(int a,int b);
}
public class Main {

    static void operation(MyInterface i,int a,int b){
        i.multiply(a,b);
    }

    public static void main(String[] args) {
        operation(
                (a,b)-> System.out.println("multiply:"+a*b),5,2
        );
    }
}
