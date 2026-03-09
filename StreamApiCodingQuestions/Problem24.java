package StreamApiCodingQuestions;

import java.util.List;

//Given a list of integers, find first old number
public class Problem24 {
    public static void main(String[] args) {
        List<Integer> list = List.of(8,6,5,4,3,7);

        list.stream().filter(n->n%2!=0)
        .findFirst().ifPresent(n -> System.out.println(n));
    }

}
