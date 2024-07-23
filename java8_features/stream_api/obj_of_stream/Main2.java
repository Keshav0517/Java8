package java8_features.stream_api.obj_of_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        String[] name={"Durgesh","Ram","Raju","Ganesh"};
        Stream<String> stream =Stream.of(name);
        stream.forEach(i-> System.out.println(i));    // It is used for iteration


    }
}
