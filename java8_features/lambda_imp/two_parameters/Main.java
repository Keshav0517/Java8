package java8_features.lambda_imp.two_parameters;

interface MyInterface{
    boolean factor(int a,int b);
}
public class Main {
    public static void main(String[] args) {
        MyInterface isFactor=(a,b)->{
          return a%b==0;
        };

        if (isFactor.factor(10,2)){
            System.out.println("Factor");
        }
        else {
            System.out.println("Not factor");
        }
    }
}
