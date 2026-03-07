package HashMapMethods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsent {
    public static void main(String[] args) {
        List<Integer> arr = List.of(1,2,3,4,5,6,7,8);

        Map<String , List<Integer>> map = new HashMap<>();

        for(Integer n : arr){
            String key = (n%2)==0?"even":"odd";
             map.computeIfAbsent(key, k -> new ArrayList<>())
               .add(n);

        }
        System.out.println(map);
        
    }

}
