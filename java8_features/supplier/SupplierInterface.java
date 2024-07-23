package java8_features.supplier;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<String> supplier=()->"Keshav";
        System.out.println(supplier.get());

        Supplier<Integer> supplier1=()->45;
        System.out.println(supplier1.get());
    }
}
