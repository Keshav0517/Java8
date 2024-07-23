package java8_features.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        long list1 = Stream
                .iterate(0, n -> n + 1)
                .limit(101)
                .map(x->x/20)
                .distinct()
                .skip(1)
                .peek(x-> System.out.print(x+"\n"))
                .count();

        System.out.println("count:"+list1);

    }
}
