package Inheritance2;
import java.time.Year;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
    }

    public int getAge(){
        int currentDate = Year.now().getValue();
        return currentDate-Integer.parseInt(birthDate);
    }
    public double collectPay(){
        return 100000.00;
    }
    public void terminate(String endDate){
        this.endDate=endDate;
    }

}
