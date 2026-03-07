import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaChainMain {
    public static void main(String[] args) {
        String name = "Pavan";
        Function<String,String>uCase = String::toUpperCase;
        System.out.println(uCase.apply(name));

        Function<String,String> lastName = s->s.concat(" Bommedi");
        Function<String,String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));

        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));

        Function<String,String[]> f0 = uCase
        .andThen(s->s.concat(" Bommedi"))
        .andThen(s->s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));

         Function<String,String> f1 = uCase
        .andThen(s->s.concat(" Bommedi"))
        .andThen(s->s.split(" "))
        .andThen(s->s[1].toUpperCase()+", "+s[0]);
        System.out.println(f1.apply(name));

        Function<String,Integer> f2 = uCase
        .andThen(s->s.concat(" Bommedi"))
        .andThen(s->s.split(" "))
        .andThen(s->String.join(", ", s))
        .andThen(String::length);
        System.out.println(f2.apply(name));

        Predicate<String> p1 = s->s.equals("Pavan");
        Predicate<String> p2 = s->s.equalsIgnoreCase("pavan");
        Predicate<String> p3 = s->s.startsWith("P");
        Predicate<String> p4 = s->s.endsWith("t");

        Predicate<String> combined1 = p1.or(p2);
        Predicate<String> combined = p3.and(p4);
        System.out.println(combined1.test(name));
        System.out.println(combined.test(name));
        Predicate<String> combined2 = p3.and(p4).negate();
        System.out.println(combined2.test(name));
    }

}
