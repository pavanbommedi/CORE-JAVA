package StreamApiCodingQuestions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//given an integer array, return true if contains duplicate else return false
public class Problem22 {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,1,5,6,4,5);
        boolean hasDuplicates = arr.stream().collect(
            Collectors.groupingBy(n->n,Collectors.counting()
        )).entrySet().stream().filter(map->map.getValue()>1)
        .findFirst().isPresent();

        Set<Integer> set = new HashSet<>();

        boolean hasDup = arr.stream().anyMatch(e->!set.add(e));

        System.out.println(hasDup);

        System.out.println(hasDuplicates);

        System.out.println(arr.stream().distinct().count()!=arr.size());
    }
}
