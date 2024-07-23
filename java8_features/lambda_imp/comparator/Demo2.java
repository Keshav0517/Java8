package java8_features.lambda_imp.comparator;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {
        //By using comparator we can maintain descending order
        Set<Integer> set=new TreeSet<>(((o1, o2) -> o2-o1));     //descending order
        set.add(22);
        set.add(10);
        set.add(5);
        set.add(4);

        System.out.println(Arrays.toString(set.toArray()));   //By default it is sorted

        set.add(6);
        set.add(8);
        set.add(1);

        System.out.println(Arrays.toString(set.toArray()));

        System.out.println("New Tree Set...");
        Set<Integer> set1=new TreeSet<>();
        set1.add(4);
        set1.add(2);
        set1.add(3);
        set1.add(1);
        set1.add(5);

        System.out.println(Arrays.toString(set1.toArray()));
    }
}
