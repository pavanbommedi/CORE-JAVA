package Polymorphism;

public class Movie {

    private String title;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie(){
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+" is from "+instanceType);
    }

    public static Movie getMovie(String type,String title){
        return switch(type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }

}

class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }

    public void watchMovie(){
        super.watchMovie();
        System.out.println("...%s%n".repeat(3)+"Pleasant movie"+"Nice Adv Movie");
    }

    
}

class Comedy extends Movie{
    public Comedy(String title){
        super(title);
    }
    public void watchMovie(){
        super.watchMovie();
        System.out.println("...%s%n".repeat(3)+"Fun movie"+"Comedy nice");
    }
}

class ScienceFiction extends Movie{
    public ScienceFiction(String title){
        super(title);
    }
     public void watchMovie(){
        super.watchMovie();
        System.out.println("...%s%n".repeat(3)+"Fictional movie"+"Science nice");
    }
}
