package HashMapMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compute {

    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","apple","Mango");
        Map<String , Integer> map = new HashMap<>();

        for(String s: words){
            map.compute(s,(k,v)->v==null?1:v+1);
        }
        System.out.println(map);
    }

}
