package java8_features.predicate.binarypredicate;

import java.util.function.BiPredicate;

public class BiPredicate2 {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate1=(x,y)->x%2==0 && y%2==0;
        System.out.println(biPredicate1.test(2,4));

        BiPredicate<String,Integer> biPredicate2=(str,x)->str.length()==x;
        System.out.println(biPredicate2.test("Keshav",4));

    }
}
