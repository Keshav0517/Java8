package java8_features.consumer_functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface2 {
    public static void main(String[] args) {
        Consumer<List<Integer>> consumer1=li->{
            for (Integer i:li){
                System.out.print(i+100+" ");
            }
        };

        Consumer<List<Integer>> consumer2=li->{
            for (Integer c:li){
                System.out.print(c+" ");
            }
            System.out.println();
        };

        consumer2.andThen(consumer1).accept(Arrays.asList(1,4,3,5,3));
    }
}
