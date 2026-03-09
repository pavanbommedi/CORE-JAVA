package StreamApiCodingQuestions;

//Given a string, find a first non repeating character using stream functions

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class Problem18 {

    public static void main(String[] args) {

        String string = "Java Developers";

        string.chars().mapToObj(ch->(char)ch).collect(
            Collectors.groupingBy(ch -> ch,LinkedHashMap::new,Collectors.counting())
        ).entrySet().stream().filter(map -> map.getValue()==1)
        .map(map -> map.getKey()).findFirst().ifPresent(System.out::print);
        
    }

}
// String
//    │
//    ▼
// chars()
//    │
//    ▼
// IntStream
// [74,97,118,97,...]
//    │
//    ▼
// mapToObj()
//    │
//    ▼
// Stream<Character>
// [J,a,v,a,...]
//    │
//    ▼
// groupingBy()
//    │
//    ▼
// LinkedHashMap
// {J=1,a=2,v=2,...}
//    │
//    ▼
// entrySet().stream()
//    │
//    ▼
// filter(value==1)
//    │
//    ▼
// [J, ,D,l,o,p,r,s]
//    │
//    ▼
// map(getKey)
//    │
//    ▼
// [J, ,D,l,o,p,r,s]
//    │
//    ▼
// findFirst()
//    │
//    ▼
// Optional[J]
//    │
//    ▼
// print