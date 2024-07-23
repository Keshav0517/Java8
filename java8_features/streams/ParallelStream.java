package java8_features.streams;

import java.util.Arrays;
import java.util.stream.LongStream;

public class ParallelStream {

    //factorial method
    public static long factorial(long number){
        return LongStream.rangeClosed(1,number).reduce(1,(a,b)->a*b);
    }

    public static void main(String[] args) {
        long[] array=new long[2000];
        for (int i=0;i<array.length;i++){
            array[i]=i+1;
        }

        System.out.println("Starting time:"+System.currentTimeMillis());
        long sequentialStream = Arrays.stream(array).map(ParallelStream::factorial).sum();
        System.out.println("Factorial:"+sequentialStream);
        System.out.println("End time:"+System.currentTimeMillis());

        System.out.println();

        long startTime=System.currentTimeMillis();
        System.out.println("Start Time:"+startTime);

        long parallelStream = Arrays.stream(array).parallel().map(ParallelStream::factorial).sum();
        System.out.println(parallelStream);

        long endTime=System.currentTimeMillis();
        System.out.println("End Time:"+endTime);

    }
}
