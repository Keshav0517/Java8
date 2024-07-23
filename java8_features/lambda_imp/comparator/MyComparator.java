package java8_features.lambda_imp.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return b-a;     //for descending order,for ascending order a-b
    }
}
