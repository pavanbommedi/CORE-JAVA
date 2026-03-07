import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("alpha","bravo","charlie","delta"));

        list.forEach(s->System.out.println(s));
        System.out.println("--".repeat(20));
        list.forEach((var myString)->System.out.println(myString));
        System.out.println("--".repeat(20));
        list.forEach(s ->{
            char first = s.charAt(0);
            System.out.println(s+" means "+first);
        });

        var coords = Arrays.asList(
            new double[] {56.2234 , 39.3233},
            new double[] {55.2234 , 39.3233},
            new double[] {52.2234 , 39.3233}
            

        );
        coords.forEach( s-> System.out.println(Arrays.toString(s)));
        BiConsumer<Double,Double> p1 = (lat,lon)->System.out.printf("[lat:%.3f long:%.3f]%n",lat,lon);
        var firstPoint = coords.get(0);
        processPoint(firstPoint[0],firstPoint[1],p1);
        System.out.println("-----------");
        coords.forEach(s->processPoint(s[0], s[1], p1));
    }

    public static <T> void processPoint(T t1,T t2,BiConsumer<T,T> consumer){
        consumer.accept(t1, t2);
    }

}
