package Interfaces;


record DragonFly(String name, String type) implements Flight{


    @Override
    public void Fly() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void land() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void takeOff() {
        // TODO Auto-generated method stub
        
    }
    
}

class Satellite implements OrbitEarth{
    public void achieveOrbit(){
        System.out.println("Orbit was acheived");
    }

    @Override
    public void Fly() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void land() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void takeOff() {
        // TODO Auto-generated method stub
        
    }
    
}

interface OrbitEarth extends Flight {
    void achieveOrbit();
}

public abstract class Animal {

    protected String name;
    protected boolean canFly;
    public Animal(String name, boolean canFly) {
        this.name = name;
        this.canFly = canFly;
    }

    public abstract void move();

    

}
