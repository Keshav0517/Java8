package java8_features.method_reference.constructor_reference;

import thread_tut.thread_methods.prevent_thread.join.LicenseDemo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        List<String> name= Arrays.asList("Bob","Alice","John");

        //Lambda expression
        List<Student> students=name.stream().map(x->new Student(x)).collect(Collectors.toList());

        //Constructor reference
        //List<Student> students=name.stream().map(Student::new).collect(Collectors.toList());
    }

}
