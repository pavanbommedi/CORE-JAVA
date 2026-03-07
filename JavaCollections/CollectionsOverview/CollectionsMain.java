import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionsMain {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        String[] names = {"Warner","Watson","Smith","Clarke","Bailey","Maxwell"};
        list.addAll(List.of(names));

        list.add("Cummins");
        list.removeIf(s->s.startsWith("W"));
        list.forEach(System.out::println);
        


        
}
}
