package Abstract_Challenge;

class ArtObject extends ProductForSale {

    

    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("this "+type+" is beautiful representation");
        System.out.println(price+" is managable");
        
    }

    

}
