package Interfaces;

public class Bird extends Animal implements Flight , Trackable{

    public Bird(String name, boolean canFly) {
        super(name, canFly);
    }

    @Override
    public void land() {
        // TODO Auto-generated method stub
        System.out.println(getClass().getSimpleName()+" is landing");
        
    }

    @Override
    public void takeOff() {
        // TODO Auto-generated method stub
        System.out.println(getClass().getSimpleName()+" is Flying");
        
    }

    public void Fly(){
        System.out.println("Bird is Flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+" is tracked");
        
    }

    public void move(){
        System.out.println(getClass().getSimpleName()+" is mvoing");
    }

    

}
