import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(104,"Pavan", 28000));
        employees.add(new Employee(103,"Deekshitha", 22000));
        employees.add(new Employee(105,"Vyshnavi", 50000));
        employees.add(new Employee(101,"Rupika", 28000));
        employees.add(new Employee(102,"Ayesha", 18000));

        Collections.sort(employees,new empComparator());
        for(Employee e:employees){
            System.out.println(e);
        }
        
        
    }
}
class empComparator implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){

        int compare =  Double.compare(e1.salary, e2.salary);
        if(compare!=0){
            return compare;
        }
        return e1.name.compareTo(e2.name);
        // return (e1.salary+e1.name).compareTo(e2.salary+e2.name);
    }
}
class Employee implements Comparable<Employee> {
    private int id;
    String name;
     double salary;
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    public int compareTo(Employee e){
        return Integer.valueOf(id).compareTo(Integer.valueOf(e.id));
    }

    

    
}
