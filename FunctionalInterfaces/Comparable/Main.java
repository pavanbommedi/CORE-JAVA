import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer target = 5;
        Integer[] arr = {3,4,5,6,7};

        for(Integer n: arr){
            int val = target.compareTo(n);
            System.out.println(val);

        }
        System.out.println("--".repeat(15));

        String strTarget = "Pavan";
        String[] strArray = {"Deekshitha","Vyshnavi","Pavan","Ayesha"};
        for(String s: strArray){
            int val = strTarget.compareTo(s);
            System.out.println(val);
        }

        Student tim = new Student("Tim");
        Student[] students = { new Student("max"), new Student("davy"),new Student("Tim")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println(tim.compareTo(new Student("Tim")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students,gpaSorter.reversed());
        System.out.println(Arrays.toString(students));


}
}

class StudentGPAComparator implements Comparator<Student>{
    public int compare(Student s1,Student s2){
        return (s2.id +s2.name).compareTo(s1.id+s1.name);

    }
}

class Student implements Comparable<Student>{
    String name;
    private static int LAST_ID = 1000;
    private static Random random = new Random();

    int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id=LAST_ID++;
        gpa = random.nextDouble(1.0,4.0);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + id + " ]";
    }

    public int compareTo(Student o){
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }

    

    
}