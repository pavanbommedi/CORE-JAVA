package StreamApiCodingQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//partition list of elements into group of even and odd numbers
public class Problem27 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        Map<Boolean , List<Integer>> map = list.stream().collect(
            Collectors.partitioningBy(e->e%2==0)
        );
        System.out.println("Even "+map.get(true));
        System.out.println("old "+map.get(false));

        
    }

}
