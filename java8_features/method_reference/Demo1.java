package java8_features.method_reference;

import java.util.Arrays;
import java.util.List;

public class Demo1 {
    public static void print(String s){
        System.out.println(s);
    }

    //non static
    public void hello(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Demo1 d=new Demo1();

        List<String> students= Arrays.asList("BOB","Alice","John");
//        students.forEach(x-> System.out.println(x));
        students.forEach(Demo1::print);     //static method
        students.forEach(d::hello);         //non static


    }
}
