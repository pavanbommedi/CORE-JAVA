import java.util.ArrayList;

record OrderItem(int qty,ProductForSale product){}

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    //Static field always initiated outside any methods and share across all the methods

    public static void main(String[] args) {

        storeProducts.add(new ArtObject("Mobile", 15000, "vivo mobile"));
        storeProducts.add(new ArtObject("Laptop",60000,"HP"));

        listProducts();

        System.out.println("/order1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);
    }

    public static void listProducts(){

        for(var prod : storeProducts){
            System.out.println("-".repeat(30));
            prod.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order , int orderIndex,int qty){
        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item : order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());

        }
        System.out.println("Sales Toatal "+salesTotal);
    }
    
}


//We cannot create a object or instance for object class, the concrete class which inherit the abstract class should
//implement the abstract method and we can create a new onject for concrete class