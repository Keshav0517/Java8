package java8_features.lambda_imp.lambda_exp4;


public class Main {

    public static void main(String[] args) {
        MyInterface i1=(int a,int b)->{
          return a+b;
        };
        int res=i1.sum(5,4);
        System.out.println("Sum:"+res);

        i1.message();


    }


}
