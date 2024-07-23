package java8_features.staticmethods_interface;

interface MyInterface{
    public static void main(String[] args){
        System.out.println("Main from Interface");
    }
}
public class Demo3 {
    public static void main(String[] args) {
        MyInterface.main(new String[]{});
        System.out.println("Hello From main()");

        //overload main method
        Demo3.main("5");
        Demo3.main("2","3");
    }

    public static void main(String args){
        System.out.println("overload1");
    }

    public static void main(String args1,String args2){
        System.out.println("overload2");
    }
}
