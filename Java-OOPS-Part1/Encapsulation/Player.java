package Encapsulation;

public class Player {

    public String name;
    public int health;
    public boolean gameOver;

    public int remainingHealth(){
        return health;
    }
    public int improveHealth(int newHealth){
        health = newHealth+health;
        if(health >100){
            health = 100;
        }
        return health;
    }

}
