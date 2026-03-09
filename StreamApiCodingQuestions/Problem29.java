package StreamApiCodingQuestions;

import java.util.Comparator;
import java.util.List;

//find the longest string in a list of strings
public class Problem29 {

    public static void main(String[] args) {
        List<String> list = List.of("Sanju","Abhisek","Surya","Hardik");
        String s = list.stream().sorted(Comparator.comparingInt(String::length).reversed())
        .findFirst().get();
        System.out.println(s);
    }
}
