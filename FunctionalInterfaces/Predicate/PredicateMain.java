import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;


public class PredicateMain {

    public static void main(String[] args) {
         List<String> list = new ArrayList<>(Arrays.asList("alpha","bravo","charlie","delta"));

         list.removeIf(s -> s.equalsIgnoreCase("bravo")); //predicate boolean result
         list.forEach(s->System.out.println(s));

         list.addAll(List.of("echo","easy","earn"));
         list.forEach(s->System.out.println(s));
         System.out.println("--------");
         list.removeIf(s -> s.startsWith("ea"));
         list.forEach(s->System.out.println(s));

         BiPredicate<String,String> lamb = (s1,s2)->s1.equals(s2);

        //  var bool = processBoolean("pavan", "Pavan", lamb);
        //  System.out.println(bool);
        String target = "charlie";
        list.removeIf(s->processBoolean(s, target,lamb));
        list.forEach(s->System.out.println(s));

        Predicate<String> pred = s->s.contains("s");
        boolean res = contains("deeksha", pred);
        System.out.println(res);


    }

    public static <T> boolean processBoolean(T t1,T t2, BiPredicate<T,T> predicate){
        boolean flag = predicate.test(t1,t2);
        return flag;
    }      
    
    public static <T> boolean contains(String s,Predicate<String> func){
        return func.test(s);
    }



}