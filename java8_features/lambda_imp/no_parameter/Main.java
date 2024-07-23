package java8_features.lambda_imp.no_parameter;

interface MyInterface{
    void print();
}

public class Main {

    public static void message(MyInterface i){
        i.print();
    }

    public static void main(String[] args) {
        MyInterface i1=()-> System.out.println("Hello");
        i1.print();
    }
}
