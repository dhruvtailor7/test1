package java8;

import java.util.stream.*;

public class StreamsExample1 {
    public static void main(String[] args){
        Stream.iterate(0, element->element+1).limit(9).forEach(p-> System.out.println(p));
    }
}