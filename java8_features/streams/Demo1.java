package java8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {

        Integer[] arr={1,3,2,4,5};
        Stream<Integer> integerStream=Stream.of(arr);
        integerStream.forEach(System.out::println);

        //Convert Collection into Stream
        List<Integer> list= Arrays.asList(2,3,1,4,5);
        List<Integer> list1=list.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(list1.toString());

        String[] array={"John","Bob","Alice"};
        Arrays.stream(array).forEach(System.out::println);

        //Create Stream
        Stream<Integer> stream1=Stream.of(2,1,3,4,6,5);    //store
        System.out.println(stream1.collect(Collectors.toSet()));

        Stream<String> stream2=Stream.of("Bob","John","Annu");  //store
        System.out.println(stream2.collect(Collectors.toList()));

        Stream<Integer> stream=Stream.iterate(1,n->n+1).limit(100);   //for loop
        System.out.println(stream.collect(Collectors.toList()));

        Stream<String> stream3=Stream.generate(()->"Hello").limit(5);     //generate Hello 5 times
        System.out.println(stream3.collect(Collectors.toList()));

        Stream<Integer> stream4=Stream.generate(()->(int)Math.random()*100).limit(10);
        System.out.println(stream4.collect(Collectors.toList()));






    }
}
