package java8_features.streams;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ParallelStream1 {
    public static void main(String[] args) {
        long[] array=new long[1000000];
        Arrays.fill(array,2);

        //sequential stream
        long start=System.currentTimeMillis();

        long sequential = Arrays.stream(array).map(n -> n * n).sum();
        System.out.println("Sum:"+sequential);

        long end=System.currentTimeMillis();
        System.out.println("Sequential Time:"+(end-start));

        System.out.println();

        //parallel stream
        long sTime=System.currentTimeMillis();
        long parallel = Arrays.stream(array).parallel().map(n -> n * n).sum();
        long eTime=System.currentTimeMillis();

        System.out.println("Sum"+parallel);
        System.out.println("Parallel Time:"+(eTime-sTime));

    }
}
