package java8_features.lambda_imp.single_parameter;

interface MyInterface{
    void cube(int a);
}

public class Main {
    static void operation(MyInterface i,int a){
        i.cube(a);
    }

    public static void main(String[] args) {

     operation(a-> System.out.println("cube:"+a*a*a),5);

    }
}
