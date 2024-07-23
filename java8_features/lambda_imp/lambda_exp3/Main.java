package java8_features.lambda_imp.lambda_exp3;

public class Main {
    public static void main(String[] args) {
        //lambda
       MultiplyInterface i1=(a,b)->{
         return a*b;
       };

       int res1=i1.multiply(4,5);
        System.out.println("Multiply:"+res1);

       MultiplyInterface i2=(a,b)->{
           return a*b;
       };
       int res2=i2.multiply(10,8);
        System.out.println("Multiply:"+res2 );

    }
}
