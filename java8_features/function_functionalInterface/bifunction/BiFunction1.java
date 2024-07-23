package java8_features.function_functionalInterface.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction1 {
    public static void main(String[] args) {
        Function<String,Integer> function1=str->str.length();
        System.out.println(function1.apply("Keshav"));

        BiFunction<String,String,Integer> biFunction=(str1,str2)->str1.length()+str2.length();
        System.out.println(biFunction.apply("Kes","hav"));

    }
}
