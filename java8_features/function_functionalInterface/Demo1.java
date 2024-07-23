package java8_features.function_functionalInterface;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {
        String s="Keshav";
        Function<String,Integer> function=x->x.length();
        System.out.println("Length:"+function.apply(s));

        Function<String,String> function1=x->x.substring(0,3);
        System.out.println("Sub-String:"+function1.apply(s));



    }
}
