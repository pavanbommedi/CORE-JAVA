package Polymorphism;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("A : Adv , C : COmedy , S: SciencFIction , Q:Quit");
            String type = sc.nextLine();
            System.out.println("title of movie");
            String title = sc.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
            if(type.equalsIgnoreCase("Q")){
    break;
}
        }
        sc.close();
    }

}
