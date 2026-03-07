// remove duplicates and preserve order

import java.util.List;
import java.util.stream.Collectors;


public class Problem3 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,3,4,6,5,6);

        list.stream().distinct().forEach(System.out::println);
        list.stream().collect(Collectors.toSet()).forEach(System.out::println);
    }

}
