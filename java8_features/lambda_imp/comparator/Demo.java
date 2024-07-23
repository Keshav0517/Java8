package java8_features.lambda_imp.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo extends MyComparator{
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(3);

        System.out.println(Arrays.toString(list.toArray()));

        //Default
        Collections.sort(list);    //ascending order
        System.out.println("Ascending:"+Arrays.toString(list.toArray()));

        //using implementation class
        Collections.sort(list,new MyComparator()); //descending order

        System.out.println("Descending:"+Arrays.toString(list.toArray()));


        //using lambda expression
        Collections.sort(list,(a,b)->a-b);   //ascending order
        System.out.println("Ascending using lambda:"+Arrays.toString(list.toArray()));



    }
}
