package StreamApiCodingQuestions;

//Add a "[" as prefix ,"]" as suffix and "," delimiter for each word in String Array
import java.util.List;
import java.util.stream.Collectors;

public class Problem13 {
    public static void main(String[] args) {
        List<String> array = List.of("apple","banana","custard","Mango");
        String res = array.stream().map(word -> "["+word+"]").collect(
            Collectors.joining(",")
        );
        System.out.println(res);

    }

}
