//Reverse each word in a string

import java.util.Arrays;
import java.util.stream.Collectors;

public class problem2 {
    public static void main(String[] args) {
        String sentence = "A full stack java developer";
        String[] strArray = sentence.split(" ");     

        String reversedString = Arrays.stream(strArray).map(word -> new StringBuilder(word).reverse().toString())
        .collect(Collectors.joining(" "));

        System.out.println(reversedString);


    }

}
