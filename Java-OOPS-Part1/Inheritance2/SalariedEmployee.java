package Inheritance2;

public class SalariedEmployee extends Employee{

    private double annaulSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate,String hireDate,
            double annaulSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annaulSalary = annaulSalary;
        this.isRetired = isRetired;
    }

    @Override
    public String toString() {
        return "SalariedEmployee [annaulSalary=" + annaulSalary + ", isRetired=" + isRetired + "]"+super.toString();
    }

    public void retire(){
        terminate("12-12-2025");
        isRetired=true;

    }

    public double collectPay(){
        double payCheck = annaulSalary/26;
        return isRetired?payCheck*0.9:payCheck;
    }

    

}
