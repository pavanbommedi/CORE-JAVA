
import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Spike","dog","fast"));
        animals.add(new Dog("Tom","Wolf","slow"));
        animals.add(new Fish("GoldFish","fish","slow"));

        for(Animal animal : animals){
            System.out.println(animal);
            animal.move();
            animal.makeNosie();
            System.out.println("___________________");
 
        }




    }

}
