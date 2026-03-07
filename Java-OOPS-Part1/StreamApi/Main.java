
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,9,7,3,4);

        // Stream<Integer> Data = nums.stream().filter(n->n%2==0);
        // Data.forEach(n->System.out.println(n));

        Predicate<Integer> pred = n-> n%2==1;

        // Function<Integer,Integer> fun = n->n*2;

        int ac = nums.stream()
        .filter(pred)
        .map(n->n*2)
        .reduce(0,(acc,n)->acc+n);
        System.out.println(ac);


    
    
    }
}
