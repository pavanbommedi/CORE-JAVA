package Inheritance1;

public class Fish extends Animal {

    private int gills;
    private int fins;
    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins; 
    }

    private void moveMuscles(){
        System.out.print("muscles moving");
    }

    private void moveBackFin(){
        System.out.print("backfin moving");
    }

    public void move(String speed){
        super.move(speed);
        moveMuscles();
        if(speed=="fast") moveBackFin();
    }

    @Override
    public String toString() {
        return "Fish [gills=" + gills + ", fins=" + fins + "]";
    }

    public void makeNoise(){
        System.out.println("sub class called");
    }

    

    

}
