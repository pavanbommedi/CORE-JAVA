package HashMapMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetOrDefault {
    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","apple","Mango");
        Map<String , Integer> map = new HashMap<>();

        for(String word : words){
            map.compute(word,(k,v)->v==null?1:v+1);
        }
        System.out.println(map);
        int count = map.getOrDefault("Guava", 1);
        System.out.println(count);
    }

}
