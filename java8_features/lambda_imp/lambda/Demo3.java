package java8_features.lambda_imp.lambda;
@FunctionalInterface
interface A{
    int sum(int a,int b);
}

@FunctionalInterface
interface B{
    int multiply(int x,int y);
}

public class Demo3{

    public static void main(String[] args) {
        A r=(a,b)->a+b;
        System.out.println("Sum:"+r.sum(40,50));

        B r1=(x,y)->x*y;
        System.out.println("Multiply:"+r1.multiply(4,5));

    }

}
