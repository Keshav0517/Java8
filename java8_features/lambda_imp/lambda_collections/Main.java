package java8_features.lambda_imp.lambda_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(102);
        list.add(100);
        list.add(150);
        list.add(144);

//        Iterator<Integer> itr=list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        //lambda
        System.out.println("Before Sorting");
        list.forEach(integer -> System.out.print(integer+" "));

        System.out.println();

        System.out.println("After sorting");
        Collections.sort(list,(o1,o2)->(o1>o2) ? -1 : (o1<o2) ? 1 : 0);
        list.forEach(integer -> System.out.print(integer+" "));


    }
}
