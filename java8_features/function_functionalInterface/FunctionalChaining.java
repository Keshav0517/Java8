package java8_features.function_functionalInterface;

import java.util.function.Function;

public class FunctionalChaining {
    public static void main(String[] args) {
        Function<String,String> function1=x->x.toUpperCase();
        Function<String,String> function2=x->x.substring(0,3);

        //Functional Chaining using andThen
        System.out.println(function1.andThen(function2).apply("vipul"));
       //Function<String,String> upperSubString=function1.andThen(function2);
        // System.out.println(upperSubString.apply("vipul"));
        //System.out.println(upperSubString.apply("keshav"));

    }
}
