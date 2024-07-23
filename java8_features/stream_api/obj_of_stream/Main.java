package java8_features.stream_api.obj_of_stream;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //way 1
        Stream<Object> emptyStream=Stream.empty();
        emptyStream.forEach(e-> System.out.println(e));

    }
}
