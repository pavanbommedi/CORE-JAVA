//Merge two sorted list into one sorted list

import java.util.List;
import java.util.stream.Stream;

public class Problem6 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,2,3);
        List<Integer> list2 = List.of(1,5,6);

        List<Integer> mergedList = Stream.concat(list1.stream(),list2.stream()).sorted().toList();

        System.out.println(mergedList);
    }



}
