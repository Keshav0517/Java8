package java8_features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo4 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("abc","abdeft","ab","a","asert");

        //first convert into asc and then convert into desc
        List<String> newList=list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(newList);

        //sorting according to length of String
        List<String> newList2=list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(newList2);

        //reverse()
        List<String> reversed = newList2.reversed();
        System.out.println(reversed);
    }
}
