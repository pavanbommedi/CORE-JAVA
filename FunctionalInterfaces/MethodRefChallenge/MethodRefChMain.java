import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class MethodRefChMain {

    private static Random random = new Random();

    record Person(String firstName){
        public String last(String s){
            return firstName +" "+s.substring(0,s.indexOf(" "));

        }
    }

    public static void main(String[] args) {

        String [] names = {"Pavan","Deekshith","Ramesh","Rajeev","Ayesha","Kiran"};
        List<UnaryOperator<String>> list = new ArrayList<>(List.of(
            String::toUpperCase, //Class::instanceMethod
            s->s+=" "+getRandomChar('D', 'M'),
            new Person("Bommedi")::last, //Object :: instanceMethod
            MethodRefChMain::reverse, //Class::staticMethod
            String :: new, //Class::Constructor
            // s->new String(s),
            String::valueOf
            

        ));
        changeApply(names, list);

        
    }

    public static void changeApply(String[] names,List<UnaryOperator<String>> stringFunctions){
        List<String> backedByArray = Arrays.asList(names);
        for(var function: stringFunctions){
            backedByArray.replaceAll(function);
            System.out.println(Arrays.toString(names));
        }

    }

    public static char getRandomChar(char startChar,char endChar){
        return (char) random.nextInt((int)startChar,(int)endChar);
    }

    public static String reverse(String s,int start,int end){
        return new StringBuilder(s.substring(start,end)).reverse().toString();
    }

    public static String reverse(String s){
        return reverse(s, 0, s.length());
    }

}
