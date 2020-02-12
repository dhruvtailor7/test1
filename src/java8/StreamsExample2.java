package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class StreamsExample2 implements UnaryOperator<Integer>{

    public static void accept(Integer integer) {
        System.out.println(integer);
    }

    @Override
    public Integer apply(Integer integer) {
        return integer+1;

    }

    public static void main(String[] args) {
        StreamsExample2 streamsExample2=new StreamsExample2();
        List<Integer> list  =new ArrayList<>();
        for(int i=0;i<100;i++)
            list.add(i);

        list.stream().parallel().forEach(integer -> System.out.println(integer));
       // Stream.iterate(1,streamsExample2).filter(integer -> integer%2==0).limit(10).forEach(java8.StreamsExample2::accept);
    }
}
