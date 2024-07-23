package java8_features.function_functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo2 {
    public static void main(String[] args) {
        Function<String,String> subString=x->x.substring(0,3);

        Function<List<Student>,List<Student>> studentsWithVip= li->{
            List<Student> list=new ArrayList<>();
            for (Student s:li){
                if(subString.apply(s.getName()).equalsIgnoreCase("vip")){
                    list.add(s);
                }
            }
            return list;
        };


       Student s1=new Student(54,"Vipul");
       Student s2=new Student(105,"Kunal");
       Student s3=new Student(101,"Nilesh");

        List<Student> students=Arrays.asList(s1,s2,s3);
        List<Student> filteredStudents=studentsWithVip.apply(students);
        System.out.println(filteredStudents);

    }
}

class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
