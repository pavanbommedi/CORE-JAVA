import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {
    public static void main(String[] args) {

        String[] str = new String[] {"Pavan","Deekshitha","Vyshnavi","Ayesha","Rupika"};

        String[] res = supplierFunction(15, str, ()-> new Random().nextInt(0,str.length));
        System.out.println(Arrays.toString(res));
        
    }

    public static String[] supplierFunction(int count,String[] s, Supplier<Integer> supplier){

        String [] selectedValues = new String[count];
        for(int i=0;i<count;i++){
            selectedValues[i]=s[supplier.get()];
        }
        return selectedValues;

    }

}
