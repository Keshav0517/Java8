package java8_features.predicate;

import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {

        //Predicate<String> checkStringContain_s=x->x.toLowerCase().contains("w");
        //System.out.println(checkStringContain_s.test("Keshav"));

        //When both Predicates are true,it returns true
        Predicate<String> checkLetterStartsWith_K=x->x.toLowerCase().charAt(0)=='k';
        Predicate<String> checkLetterEndsWith_V=x->x.toLowerCase().charAt(x.length()-1)=='w';

        Predicate<String> and=checkLetterStartsWith_K.and(checkLetterEndsWith_V);
        System.out.println("and method:"+and.test("Keshav"));


        Predicate<String> or=checkLetterStartsWith_K.or(checkLetterEndsWith_V);
        System.out.println("Or method:"+or.test("Keshav"));

        Predicate<String> negate=checkLetterStartsWith_K.negate();
        System.out.println("negate method:"+negate.test("Kunal"));

        Student s1=new Student(11,"Vipul");
        Student s2=new Student(104,"Kunal");

        Predicate<Student> studentPredicate=x->x.getId() >100;
        System.out.println("Check Student Id:"+studentPredicate.test(s1));

        Predicate<Object> predicate=Predicate.isEqual("Kunal");
        System.out.println(predicate.test("kiutre"));
    }

    static class Student{
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
    }
}
