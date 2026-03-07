package StaticLesson;

public class Dog {

    private static String name;
    public Dog(String name){
        Dog.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public static void printStaticName(){
        System.out.println("Static method"+" "+name);
    }

}
