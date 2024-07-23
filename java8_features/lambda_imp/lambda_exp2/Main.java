package java8_features.lambda_imp.lambda_exp2;

public class Main {
    public static void main(String[] args) {


        SumInterface s1=new SumInterface() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }

            @Override
            public int multiply(int a, int b) {
                return a*b;
            }
        };

        int res=s1.sum(4,5);
        System.out.println("sum:"+res);

        int res1=s1.multiply(5,4);
        System.out.println("Multiply:"+res1);


        //Lambda is used when interface having only one abstract method
    }
}
