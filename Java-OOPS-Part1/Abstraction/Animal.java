

public abstract class Animal {

    protected String name;
    protected String type;
    protected String Speed;

    public Animal(String name, String type, String speed) {
        this.name = name;
        this.type = type;
        this.Speed = speed;
    }

    public abstract void move();

    public abstract void makeNosie();

    public final String getExplicitType(){
        return this.getClass().getSimpleName()+"( "+type+" )";
    }

    

}
