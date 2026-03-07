import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class test1{
    public static void main(String[] args) {
        // List<Integer> list = List.of(1,2,3,3,1,7,5,6);
        // list.stream()
        // .sorted().forEach(System.out::println);
        // System.out.println(list);

        // List<String> names = List.of("Java", "Spring", "Boot", "Java", "Microservices");

        // List<String> sortNames = names.stream().distinct().sorted().collect(Collectors.toList());
        // System.out.println(sortNames);
         // int result = list.stream().reduce(0,(a,b)->a<b?b:a);
        // System.out.println(result);
        // List<String> names = List.of("Pavan", "Java", "Spring", "React");
        // Optional<String> largerString = names.stream().filter(n->n.length()>4).findFirst();
        // largerString.ifPresent(System.out::println);
    //     List<Integer> list = List.of(1, 2, 3, 4, 5);
    //     list.stream()
    // .filter(n -> {
    //     System.out.println("Filter: " + n);
    //     return n > 2;
    // })
    // .map(n -> {
    //     System.out.println("Map: " + n);
    //     return n * 2;
    // })
    // .findFirst();
    // List<String> names = List.of("Pavan", "Java", "java" ,"Spring");

    List<List<Integer>> list =
        List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));

        List<Integer> listNew = list.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println(listNew);






        
    }
}