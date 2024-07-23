package java8_features.stream_api.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //create list and filter even no
        List<Integer> list=List.of(2,1,3,5,4); //Immutable

        List<Integer> list1=new ArrayList<>(); //mutable
        list1.add(2);
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(4);

        List<Integer> list2=Arrays.asList(2,1,3,5,4);

        //even no
        List<Integer> evenList=new ArrayList<>();
        for (Integer i:list){
            if (i%2==0){
                evenList.add(i);
            }
        }
        System.out.println(list);
//        System.out.println(evenList);

        Stream<Integer> stream =list.stream();
        List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        Stream<Integer> stream1=list.stream();
        List<Integer> square=stream1.map(x->x*x).collect(Collectors.toList());
        System.out.println(square);




    }
}
