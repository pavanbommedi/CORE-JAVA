package EmployeeClassProblem;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
    new Employee(1, "Pavan", "IT", 90000),
    new Employee(2, "Ravi", "IT", 90000),
    new Employee(3, "Anil", "HR", 60000),
    new Employee(4, "Sunil", "HR", 75000),
    new Employee(5, "Kiran", "Finance", 70000)
);

    //Get Second Highest Salary per department using Stream API


                Map<String, Optional<Employee>> result =
    employees.stream()
        .collect(Collectors.groupingBy(
            Employee::getDepartment,
            Collectors.collectingAndThen(
                Collectors.toList(),
                list -> list.stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                    .skip(1)
                    .findFirst()
            )
        ));

        result.forEach((dep,emp)->System.out.println(dep+" "+emp));

 Comparator<Employee> empdist = Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName);
    Map<String,Optional<Employee>> map = employees.stream().collect(
        Collectors.groupingBy(Employee::getDepartment,Collectors.maxBy(
            empdist
        )));


       
        




















    // Map<String,Optional<Employee>> salaryMap = employees.stream()
    //         .collect(Collectors.groupingBy(
    //             Employee::getDepartment,
    //             Collectors.maxBy(
    //                 Comparator.comparingDouble(Employee::getSalary)
    //             )
    //         ));
    // salaryMap.forEach((dep,emp)->System.out.println(dep+"->"+emp));

    //--------------------------------------------------------------

    //Removing optional
    // Map<String , Employee> salaryMap = employees.stream().collect(
    //     Collectors.groupingBy(
    //         Employee::getDepartment,
    //         Collectors.collectingAndThen(
    //             Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
    //              Optional::get)
    //     )
    // );
    // salaryMap.forEach((dep,emp)->System.out.println(dep+"->"+emp));


    //--------------------------------------------------------
    
    //Only highest salary
    // Map<String,Double> salMap = employees.stream().collect(
    //     Collectors.groupingBy(
    //         Employee::getDepartment,
    //         Collectors.collectingAndThen(
    //             Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), 
    //             e->e.get().getSalary())
    //     )
    // );
    // salMap.forEach((dep,sal)->System.out.println(dep+"->"+sal));

    //what if you employees having the highest salary same

    // Comparator<Employee> compdeterministic = Comparator.comparingDouble(Employee::getSalary)
    // .thenComparing(Employee::getName);


    // Map<String , Employee> salMap = employees.stream().collect(
    //     Collectors.groupingBy(
    //         Employee::getDepartment,
    //         Collectors.collectingAndThen(
    //            Collectors.maxBy(compdeterministic),Optional::get
    //         )
    //     )
    // );
    // salMap.forEach((dep,sal)->System.out.println(dep+" "+sal));

    // //Top 2 highest salaries
    // Map<String , List<Employee>> salTop2Map = employees.stream().collect(Collectors.groupingBy(
    //     Employee::getDepartment,
    //     Collectors.collectingAndThen(
    //         Collectors.toList(),
    //         list->list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
    //         .limit(2).collect(Collectors.toList())
    //         )
    //     )
    // );
    // salTop2Map.forEach((dep,emp)->System.out.println(dep+" "+emp));









}
}
