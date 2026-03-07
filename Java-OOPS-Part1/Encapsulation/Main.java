package Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Player pavan = new Player();
        // pavan.name="Pavan";
        // pavan.health=100;
        // pavan.gameOver=false;

        // System.out.println(pavan.remainingHealth());
        // System.out.println(pavan.improveHealth(10));
        // pavan.health=200;
        // System.out.println(pavan.remainingHealth());
        EnhancedPlayer pavan = new EnhancedPlayer("pavan");
        System.out.println(pavan.remainingHealth());
        System.out.println(pavan.improveHealth(-10));
        pavan.isGameOver();
    }
    
} 
