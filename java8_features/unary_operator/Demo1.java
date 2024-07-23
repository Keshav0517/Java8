package java8_features.unary_operator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Demo1 {
    public static void main(String[] args) {
       //UnaryOperator is used only for function1,function2

       Function<String,String> function2=x->x.toUpperCase();

       UnaryOperator<String> unaryOperator2=x->x.toUpperCase();
       System.out.println(unaryOperator2.apply("Keshav"));



        Function<Integer,Integer> function1= x->x*x;

        UnaryOperator<Integer> unaryOperator1=x->x*x;
        System.out.println(unaryOperator1.apply(2));

        //UnaryOperator is not used for function3
        Function<String,Integer> function3=x->x.length();

    }
}
