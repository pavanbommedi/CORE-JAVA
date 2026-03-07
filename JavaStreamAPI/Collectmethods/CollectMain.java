package Collectmethods;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectMain {
    public static void main(String[] args) {

        List<String> names = List.of("Java","Python","JavaScript","React","Java","Python");
        //Collectors.toList()
        // List<String> largerNames = names.stream().filter(n->n.length()>4)
        // .collect(Collectors.toList());
        // System.out.println(largerNames);

        //Collections.toMap()
        // Map<String,Integer> lengthNames = names.stream().collect(Collectors.toMap(
        //     word->word, String::length));//Fail at run time because map wont allow duplicates so use Merge
        // lengthNames.forEach((word,length)->System.out.println(word+" "+length));

        //Collection.toMap() using merge
        // Map<String,Integer> lengthNamesNew = names.stream().collect(Collectors.toMap(
        //     word->word, String::length,(oldVal ,newVal)->oldVal));
        // lengthNamesNew.forEach((word,length)->System.out.println(word+" "+length));
        
        // //Collectors.groupingBy()
        // Map<Integer,List<String>> namesLength = names.stream().collect(Collectors.groupingBy(String::length));
        // namesLength.forEach((length,list)->System.out.println(length+"->"+list));

        // //Collectors.groupingBy() and Collectors.counting()
        // Map<String,Long> freqNames = names.stream().collect(Collectors.groupingBy(
        //     word->word,Collectors.counting()
        // ));
        // freqNames.forEach((word,freq)->System.out.println(word+"->"+freq));

        // Map<Boolean,List<String>> splitBool = names.stream().collect(Collectors.partitioningBy(
        //     word->word.length()>4));
        // splitBool.forEach((bool,list)->System.out.println(bool+"->"+list));

        //Collectors.counting
        // Long res = names.stream().filter(n->n.length()>4)
        // .collect(Collectors.counting());
        // System.out.println(res);

        // //Collectors.joining()
        // String joined =
        // names.stream()
        //      .collect(Collectors.joining(", "));
        // System.out.println(joined);

        //Collectors.mapping()
        // Map<Integer,List<String>> namesMap = names.stream().collect(
        //     Collectors.groupingBy(
        //-         String::length,
        //         Collectors.mapping(
        //             String::toUpperCase,Collectors.toList())
        //     )
        // )
        
        
        
        
        
        
        ;
        // namesMap.forEach((val,list)->System.out.println(val+"->"+list));
        // //Collectors.collectingAndThen()
        // List<String> unmodifiableList =names.stream()
        //      .filter(n -> n.length() > 4)
        //      .collect(Collectors.collectingAndThen(
        //          Collectors.toList(),
        //          Collections::unmodifiableList
        //      ));
        // System.out.println(unmodifiableList);  //immutable list
        



        
        
    }

}
