package java8_features.predicate;

import java.util.function.Predicate;


public class Demo1 {
    public static void main(String[] args) {

        Predicate<String> predicate=name->name != "Keshav";   //hold condition
        System.out.println(predicate.test("keshav"));      //test condition

        Predicate<Integer> predicate1=x->x>500;    //hold condition
        System.out.println(predicate1.test(400)); //test condition



    }
}
