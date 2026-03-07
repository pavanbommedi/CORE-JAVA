import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("alpha","bravo","charlie","delta"));

        // list.replaceAll(s->s.charAt(0)+" - "+s.toUpperCase());
        // System.out.println("------------");
        // list.forEach(s->System.out.println(s));

        String[] emptyStrings = new String[10];
        Arrays.fill(emptyStrings," ");
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, i->""+(i+1)+". " );
        System.out.println(Arrays.toString(emptyStrings));

        Arrays.setAll(emptyStrings, i->""+(i+1)+". " 
    + switch(i){
        case 1 -> "one";
        case 2 ->"two";
        default -> "";
    }
);
        System.out.println(Arrays.toString(emptyStrings));

        Function<String,String> func = s->s.charAt(0)+" - "+s.toLowerCase();

        list.replaceAll(s->functionProcess(func, s));
        list.forEach(s->System.out.println(s));


        
    }

    public static <T, R> R functionProcess(Function<T, R> function, T t) {
    return function.apply(t);
}

}
