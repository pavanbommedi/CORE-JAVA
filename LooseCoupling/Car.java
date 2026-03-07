public class Car{
    private Engine engine;
    public Car(Engine engine){ //Dependency injected
        this.engine = engine;
    }

    public void drive(){
        engine.start();
        System.out.println("car is moving");
    }
}