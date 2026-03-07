package Interfaces;

public class Jet implements Flight,Trackable{

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


}
