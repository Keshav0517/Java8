package java8_features.consumer_functionalinterface.biconsumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Demo1 {
    public static void main(String[] args) {
        Consumer<Integer> consumer=x-> System.out.println(x);
        consumer.accept(5);

        BiConsumer<Integer,Integer> consumer1=(x,y)-> System.out.println(x+y);
        consumer1.accept(4,5);
    }
}
