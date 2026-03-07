//How to Join to streams

import java.util.List;
import java.util.stream.Stream;

public class Problem5 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3);
        List<Integer> list2 = List.of(4,5,6);


        Stream<Integer> stream = Stream.concat(list1.stream().map(n-> n*2),
                            list2.stream().map(n-> n*2));
        
        stream.forEach(System.out::println);
    }

}
