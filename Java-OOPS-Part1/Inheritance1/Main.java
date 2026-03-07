package Inheritance1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","Huge",400.00);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuff(yorkie,"fast");
        Dog retriever=  new Dog("retriever",65,"Floppy","Swimmer");
        doAnimalStuff(retriever, "slow");

        Fish goldFish = new Fish("GoldFish",20,2,4);
        doAnimalStuff(goldFish, "fast");
    }
    public static void doAnimalStuff(Animal animal,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("--------------------");
    }

}
