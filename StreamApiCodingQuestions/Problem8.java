//Given a list of string find the strings which start with number

import java.util.List;

public class Problem8 {

    public static void main(String[] args) {
        List<String> array = List.of("apple","1banana","custard","2Mango");
        array.stream().filter(word -> Character.isDigit(word.charAt(0))).forEach(
            s->System.out.println(s)
        );

        
    }

}
