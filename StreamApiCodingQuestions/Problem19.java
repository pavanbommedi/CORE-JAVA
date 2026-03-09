package StreamApiCodingQuestions;

//given a list of integers. find min , max , sum , avg and count

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Problem19 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,11,9,54,23);

        int min = list.stream().sorted().findFirst().get();
        int max = list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
        int sum = list.stream().reduce(Integer::sum).get();
        int count = list.stream().collect(Collectors.counting()).intValue();
        Double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
        Double avg1 = list.stream().collect(Collectors.averagingInt(n->n));
        System.out.println("min "+min+" max "+max+" sum "+sum+" count "+count+" avg "+avg1);

    }
}
