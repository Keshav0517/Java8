package java8_features.predicate.binarypredicate;

import java.util.function.BiPredicate;

public class Demo1 {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> predicate=(a,b)->a.equals(b);
        boolean result=predicate.test(10,10);
        System.out.println(result);
    }
}
