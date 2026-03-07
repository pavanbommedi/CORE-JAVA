package Interfaces;

public class Truck implements Trackable {

    public void track(){
        System.out.println(getClass().getSimpleName()+" is tracked");
        
    }


}
