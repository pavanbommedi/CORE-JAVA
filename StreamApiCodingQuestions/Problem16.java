package StreamApiCodingQuestions;

//SecondLargest Number in array

import java.util.Comparator;
import java.util.List;

public class Problem16 {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,1,5,6,4,5);

    arr.stream().distinct().sorted(
            Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::print);

    }

}
