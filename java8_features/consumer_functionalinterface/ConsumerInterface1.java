package java8_features.consumer_functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface1 {
    public static void main(String[] args) {
        //Consumer
        Consumer<String> consumer=s-> System.out.println(s);
        consumer.accept("Keshav");

        //Consumer1
        Consumer<Integer> consumer1=x-> System.out.println(x);
        consumer1.accept(10);

        //Consumer2
        Consumer<List<Integer>> consumer2=li->{
            for (Integer i:li){
                System.out.print(i+10+" ");
            }
        };
        consumer2.accept(Arrays.asList(1,25,4,8,9,3));


    }
}
