package StaticLesson;

public class Main {
    public static void main(String[] args) {
        
    Dog rex = new Dog("rex"); //rex instance created
    Dog fluffy = new Dog("fluffy"); //fluffy instance created

    rex.printName(); //fluffy //As it is Static field all instances will share the same copy of field
    fluffy.printName(); //fluffy 

    Dog.printStaticName(); //Static method is only called using ClassName.methodName
    //method is only declared static when there is no reference of instance variables or methods in it
    

}
}