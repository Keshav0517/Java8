package java8_features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,3,4,5,6,7,23,33,44,55,11,90,10);

        //Even no list
        List<Integer>  filteredList =list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("Filtering:"+filteredList);

        //map(),distinct()
        List<Integer> newList = filteredList.stream().map(x -> x / 2).distinct().collect(Collectors.toList());
        System.out.println("Mapping:"+newList);

        //sorted()
        List<Integer> sortedList = newList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorting Asc:"+sortedList);

        //sorted((a,b)->b-a),sorted(Comparator.reverseOrder())  descending order
        List<Integer> descendingSorting=newList.stream().sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println("Sorting Desc:"+descendingSorting);

        //limit()
        List<Integer> startingValues = descendingSorting.stream().limit(3).collect(Collectors.toList());
        System.out.println("2 values from starting of list:"+startingValues);

        //skip()
        List<Integer> skipValues = descendingSorting.stream().skip(1).collect(Collectors.toList());
        System.out.println("Skip values from starting:"+skipValues);


        //reduce()
        List<Integer> list1=Arrays.asList(1,2,3,4,5);
        Integer reduce=list1.stream().reduce(0,(a,b)->a+b);    //sum ,reduce(0,Integer::sum)
        System.out.println("Sum:"+reduce);

        //flatMap()  list of list
        List<List<String>> listOfList=Arrays.asList(
                Arrays.asList("a","b"),
                Arrays.asList("c","d"),
                Arrays.asList("e","f")
        );

        Stream<String> stream = listOfList.stream()
                .flatMap(li -> li.stream())   //flatMap(Collection::stream)
                .map(String::toUpperCase);
        System.out.println(stream.collect(Collectors.toList()));



        Stream<Integer> filteredStream=list.stream().filter(x->x%2!=0);
        System.out.println(filteredStream.collect(Collectors.toList()));

    }
}
