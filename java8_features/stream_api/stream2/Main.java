package java8_features.stream_api.stream2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> list= List.of("Hello","Java","Collections","Stream");
        Stream<String> stream=list.stream();

        List<String> newList=stream.filter(s->s.startsWith("J")).collect(Collectors.toList());
        System.out.println(newList);

    }
}
