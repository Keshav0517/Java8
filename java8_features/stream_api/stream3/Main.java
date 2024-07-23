package java8_features.stream_api.stream3;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(4);

        List<Integer> newList =treeSet.stream().filter(i->i>2).collect(Collectors.toList());
        System.out.println(newList);


    }
}
