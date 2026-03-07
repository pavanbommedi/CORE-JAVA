public class Car {
    private String make;
    private String model;
    private int doors;
    private boolean isConvertabile;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertabile() {
        return isConvertabile;
    }

    

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertabile(boolean isConvertabile) {
        this.isConvertabile = isConvertabile;
    }

    public void displayCar(){
        System.out.println("doors- "+doors+" "+make+" "+model+" "+isConvertabile);
    }
    
}
