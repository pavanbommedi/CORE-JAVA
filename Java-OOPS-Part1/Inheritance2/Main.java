package Inheritance2;

public class Main {
    public static void main(String[] args) {
         Employee Pavan = new Employee("Pavan","2002","15-01-2024");
         System.out.println(Pavan);
         System.out.println("Age: "+Pavan.getAge());
         System.out.println("Pay: "+Pavan.collectPay());
         System.out.println("_____________________________");

         SalariedEmployee John = new SalariedEmployee("John","2001","01-01-2001",25000.00,false);
         System.out.println(John);
         System.out.println("Age: "+John.getAge());
         System.out.println("PayCheck: "+John.collectPay());
         John.retire();
         System.out.println("john pension pay :"+John.collectPay());
         System.out.println("_____________________________");

         HourlyEmployee mary = new HourlyEmployee("mary", "2000", "1-1-2010", 20);
         System.out.println(mary);
         System.out.println("Marys paycheck: "+mary.collectPay());
         System.out.println("Marys Holidays Pay: "+mary.getDoublePay());

        
    }

   


}
