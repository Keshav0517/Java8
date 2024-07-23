package java8_features.lambda_imp.lambda_exp4;

public interface MyInterface {
    int sum(int a,int b);

    default void message(){
        System.out.println("Message from Interface...");
    }
}
