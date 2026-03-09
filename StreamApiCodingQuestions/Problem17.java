package StreamApiCodingQuestions;

//find the words in a sentence with k vowels

import java.util.Arrays;

public class Problem17 {

    public static void main(String[] args) {
        String sentence = "I have a apple and orange on a table";
        long k =2;

        Arrays.stream(sentence.split(" ")).filter(
            word -> countVowels(word)==k
        ).forEach(System.out::println);

        //Always use Arrays.stream(String[]) for String[]
    }

    public static long countVowels(String word){
        return word.chars().mapToObj(ch -> (char)ch).filter(
            ch -> "aeiouAeiou".indexOf(ch)!=-1
        ).count();

        //.chars() -> string to IntStream
        //.mapToObj -> IntStream to OjbStream
    }

}
