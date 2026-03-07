  
package Customer;

public class Customer {
    private String name;
    private int creditLimit;
    private String department;

    
    public Customer(String name, int creditLimit, String department) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.department = department;
        System.out.println("3 parameter called");
    }

    public Customer() {
        this("pavan",1000,"IT");
        System.out.println("No ARGS called");
    }

    public Customer(String name, int creditLimit) {
        this(name,creditLimit,"EEE");
        this.name = name;
        this.creditLimit = creditLimit;
        System.out.println("2 Paramter called");
    }

    public String getName() {
        return name;
    }
    public int getCreditLimit() {
        return creditLimit;
    }
    public String getDepartment() {
        return department;
    }

    public void display(){
        System.out.println(this.name+" "+this.creditLimit+" "+this.department);
    }

    



}
