package StreamApiCodingQuestions;

//Find 3rd longest word in a String

import java.util.Comparator;
import java.util.List;

public class Problem20 {
    public static void main(String[] args) {
         List<String> array = List.of("apple","banana","custard","Mango");
         array.stream().sorted((a,b)->Integer.compare(a.length(),b.length()))
         .skip(2)
         .findFirst().ifPresent(System.out::println);

         array.stream().sorted(Comparator.comparingInt(String::length).reversed())
         .skip(2)
         .findFirst().ifPresent(System.out::print);
    }
}
