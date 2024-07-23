package java8_features.lambda_imp.lambda_collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
//        TreeSet<Integer> treeSet=new TreeSet<>(((o1, o2) -> o1>o2?-1:o1<o2?1:0));  Descending order
        TreeSet<Integer> treeSet=new TreeSet<>(); //ascending order

        treeSet.add(102);
        treeSet.add(450);
        treeSet.add(140);
        treeSet.add(200);
        treeSet.add(210);

        System.out.println("after Sorting...");
        Iterator itr=treeSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }




    }
}
