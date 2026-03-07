
public class Fish extends Animal {

    public Fish(String name, String type, String speed) {
        super(name, type, speed);
    }

    
    
     public void move(){
        System.out.println(getExplicitType()+" moving");

        }
    public void makeNosie(){

        if(type == "Wolf") System.out.println("Howling");
        else System.out.println("Woof...!");
        
    }


}
