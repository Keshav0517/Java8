package java8_features.binary_operator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;


public class Demo1 {
    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction1=(str1,str2)->str1+str2;

        BinaryOperator<String> binaryOperator1=(str1,str2)->str1+str2;
        System.out.println(binaryOperator1.apply("Keshav","Moraniya"));



    }
}
