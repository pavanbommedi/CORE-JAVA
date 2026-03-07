import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ChallengeMain {

    public static void main(String[] args) {

        //Consumer challenge
        String s ="hello world";

        Consumer<String> str = sentence -> {
            String[] strArray = sentence.split("");
            for(String o:strArray) System.out.println(o);
        };

        Consumer<String> strForEach = sentence -> {
            String[] strArray = sentence.split("");
            Arrays.asList(strArray).forEach(a->System.out.println(a));
        };
        //Lambda expression
        Consumer<String> strConcise = sentence -> Arrays.asList(sentence.split("")).forEach(a->System.out.println(a));


        System.out.println("-----------------------");
        strForEach.accept(s);
          System.out.println("-----------------------");


        str.accept(s);
          System.out.println("-----------------------");
          strConcise.accept(s);

        //Function Challenge
        Function<String,String> func = string -> {
            String newString="";
            for(int i =0;i<string.length();i++){
                if(i%2==1) newString+=string.charAt(i);
            }
            return newString;

        };
        // String newString = func.apply("Pavan Kumar");
        // System.out.println(newString);
        System.out.println(processFunction("1234567 ", func));

        Supplier<String> sentence = () -> "I Love Java";
        String iLoveJava = sentence.get();
        System.out.println(iLoveJava);

        
        
    }
    public static <T,R> String processFunction(String s, Function<String,String> function){
        return function.apply(s);
    }
}
