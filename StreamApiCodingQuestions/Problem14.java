package StreamApiCodingQuestions;

//Find a sum of first 2 numbers in a list

import java.util.List;

public class Problem14 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,4,5,6);

        int sum = list.stream().limit(2).mapToInt(Integer::intValue).sum();
        //mapToInt = Stream<Integer>  →  IntStream
        int sum1 = list.stream().limit(2).reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println(sum1);
    }

}
