package StreamApiCodingQuestions;

//Given a list of transactions , find the sum of amount on each day of transaction

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transaction{
    private String date;
    private double amount;
    public Transaction(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }
    public String getDate() {
        return date;
    }
    public double getAmount() {
        return amount;
    }
    
}

public class Problem21 {

    public static void main(String[] args) {
        List<Transaction> array = List.of(
            new Transaction("01-02-2002", 100.8),
            new Transaction("01-02-2002", 220.8),
            new Transaction("02-02-2002", 230.8),
            new Transaction("02-02-2002", 400.8),
            new Transaction("03-02-2002", 500.8)
        
        );

        Map<String,Double> map = array.stream().collect(Collectors.groupingBy(
            Transaction::getDate,Collectors.summingDouble(Transaction::getAmount)
        ));

        map.forEach((k,v)->System.out.println(k+"-> "+v));
        
    }



}

