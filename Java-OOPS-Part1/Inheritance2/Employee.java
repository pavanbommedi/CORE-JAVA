package Inheritance2;

public class Employee extends Worker{

    private long employeeID;
    private String hireDate;

    private static int employeeNo = 256000;

    public Employee(){

    }

    public Employee(String name,String birthDate,String hireDate){
        super(name,birthDate);
        this.employeeID=employeeNo++;
        this.hireDate=hireDate;
    }

    @Override
    public String toString() {
        return "Employee [employeeID=" + employeeID + ", hireDate=" + hireDate + ", toString()=" + super.toString()
                + ", getClass()=" + getClass() + "]";
    }

    

}
