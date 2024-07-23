package java8_features.lambda_imp.comparator;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {
        Map<Integer,Character> map=new TreeMap<>();
        map.put(3,'Z');
        map.put(2,'X');
        map.put(1,'Y');

        System.out.println(Arrays.toString(map.entrySet().toArray()));

        Map<Integer,Character> map1=new TreeMap<>((a,b)->b-a);
        map1.put(7,'P');
        map1.put(5,'R');
        map1.put(4,'S');
        map1.put(6,'W');

        System.out.println(Arrays.toString(map1.entrySet().toArray()));

    }
}
