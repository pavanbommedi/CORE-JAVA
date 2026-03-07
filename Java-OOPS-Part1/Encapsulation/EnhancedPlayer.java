package Encapsulation;

public class EnhancedPlayer {

    private String name;
    private int health;
    private boolean gameOver;
    
    public EnhancedPlayer(String name) {
        this(name,100,false);
    }

    public EnhancedPlayer(String name, int health, boolean gameOver) {
        this.name = name;
        health = (health>100)?100:health;
        this.health=health;
        this.gameOver = gameOver;
    }

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
    public void isGameOver(){
        if(health<=0){
            gameOver=true;
            System.out.println("Game Over");
        };
    }

    

}
