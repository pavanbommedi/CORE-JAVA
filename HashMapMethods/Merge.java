package HashMapMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Merge {

    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","apple","Mango");
        Map<String , Integer> map = new HashMap<>();

        for(String s: words){
            map.merge(s,1,Integer::sum);
        }
        System.out.println(map);
    }

}
