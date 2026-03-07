//Find numbers which are divided by 5 in Integer List

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem1 {
    public static void main(String[] args) {
    int[] arr = new int[]{12,10,13,15,20};
    List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

    List<Integer> newList = list.stream().filter(n->n%5==0).toList();

    newList.stream().forEach(System.out::println);

    }

}
