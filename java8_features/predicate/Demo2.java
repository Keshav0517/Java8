package java8_features.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Demo2 {
    public static void main(String[] args) {
        Predicate<Integer> isEven=x->x%2==0;
        List<Integer> list= Arrays.asList(2,5,7,8,4,1,3,6);

//        int sum=list.stream().filter(isEven).mapToInt(x->x).sum();  //functional programming
//
//        System.out.println("Sum:"+sum);

        //Traditional
        for (Integer i:list){
            if (isEven.test(i)){
                System.out.println("Even Elements:"+i);
            }

        }
    }
}
