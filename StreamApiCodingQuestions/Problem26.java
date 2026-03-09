package StreamApiCodingQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//group employees by age 
class Employee{
    private String name;
    private int age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return name;
    }
}
public class Problem26 {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee("Pavan",24),
            new Employee("Sanju",24),
            new Employee("Abhi",23),
            new Employee("Surya",23),
            new Employee("Hardik",25),
            new Employee("Pant",24)
        );

        list.stream().collect(
            Collectors.groupingBy(Employee::getAge)
        ).entrySet().stream().map(map->map.getValue()).forEach(
            System.out::println
        );

        //oldest EMployee
        System.out.println(list.stream().max(Comparator.comparingInt(Employee::getAge)).get());

    }

}
