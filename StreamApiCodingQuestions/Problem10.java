//Sort the elements in Descending order

import java.util.Comparator;
import java.util.List;

public class Problem10 {

    public static void main(String[] args) {
        List<Integer> list = List.of(12,11,9,54,23);

        List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).toList();
        List<Integer> sortedList1 = list.stream().sorted((a,b)->b-a).toList();
        List<Integer> sortedList2 = list.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).toList();

        System.out.println(sortedList);
        System.out.println(sortedList2);
        System.out.println(sortedList1);

    }

}
