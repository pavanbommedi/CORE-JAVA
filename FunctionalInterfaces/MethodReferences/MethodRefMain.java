import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

class PlainOld{
    private static int last_id=1;
    private int id;

    public PlainOld(){
        id = last_id++;
        System.out.println("constructor is called id: "+id);

    }
}

public class MethodRefMain {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>(Arrays.asList("Pavan","Deekshitha","vyshnavi"));
        strList.forEach(s -> System.out.println(s));

        // calculator((a,b)->a+b, 10, 20);
        calculator(Integer::sum, 10, 20);
        calculator(Double::sum, 2.4, 0.9);

        // // PlainOld plainOld = new PlainOld();
        // Supplier<PlainOld> plainOld = PlainOld::new;

        // PlainOld newPojo = plainOld.get();

        // PlainOld[] pojo1 = plainOlds(plainOld, 10);

        calculator(String::concat, "Hello", "World");

        BiFunction<String,String,String> res = String::concat;
        BinaryOperator<String> res1 = String::concat;
        UnaryOperator<String> res2 = String::toUpperCase;

        System.out.println(res.apply("Pavan"," Bommedi"));
        System.out.println(res1.apply("Vyshnavi", " Arpikatla"));
        System.out.println(res2.apply("Deekshitha"));

        
        


}

    public static <T> void calculator(BinaryOperator<T> function,T t1,T t2){
        var res = function.apply(t1, t2);
        System.out.println(res);
    }

    public static PlainOld[] plainOlds(Supplier<PlainOld> func,int count){
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array,i-> func.get());
        return array;
    }

}
