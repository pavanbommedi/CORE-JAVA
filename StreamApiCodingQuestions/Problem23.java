package StreamApiCodingQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Count of each character in a string
public class Problem23 {

    public static void main(String[] args) {
        String s = "Hi java developers";

        Map<String,Long> map = Arrays.stream(s.split("")).filter(ch-> ch!=" ").collect(
            Collectors.groupingBy(ch -> ch,LinkedHashMap::new,Collectors.counting())
        );
        map.forEach((k,v)->System.out.println(k+"->"+v));

        s.chars().mapToObj(ch -> (char)ch).filter(ch->ch!=' ').collect(
            Collectors.groupingBy(ch -> ch,LinkedHashMap::new,Collectors.counting())
        );
        map.forEach((k,v)->System.out.println(k+"->"+v));
    }

}
