package java8_features.function_functionalInterface;

import java.util.function.Function;

public class FunctionalChaining1 {
    public static void main(String[] args) {
        Function<Integer,Integer> function1=x->x*2;
        Function<Integer,Integer> function2=x->x+10;

        System.out.println(function1.andThen(function2).apply(2)); //14

        System.out.println(function2.andThen(function1).apply(5)); //30
        System.out.println(function1.compose(function2).apply(5)); //30

        Function<String,String> indentityFunction=Function.identity();
        System.out.println(indentityFunction.apply("Vipul"));        //Vipul
    }
}
