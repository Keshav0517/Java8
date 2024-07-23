package java8_features.lambda_imp.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    public int id;
    public String name;

    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String toString(){
        return this.id+" : "+this.name;
    }
}


class Main{
    public static void main(String[] args) {
        Student s1=new Student(5,"Nilesh");
        Student s2=new Student(2,"Ram");
        Student s3=new Student(3,"Manoj");
        Student s4=new Student(1,"Ganesh");

        List<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        Collections.sort(list,(a,b)->a.id-b.id);   //ascending order
        System.out.println("Ascending order:"+Arrays.toString(list.toArray()));

        Collections.sort(list,(a,b)->b.id-a.id); //descending order
        System.out.println("Descending order:"+Arrays.toString(list.toArray()));



    }
}
