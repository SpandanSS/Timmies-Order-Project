public class CoffeePowder implements TimsMerchandise {
    public static int total = 0;
    @Override
    public String name() {
        return "Coffee Powder";
    }
    @Override
    public String getFeature() {
        return "Get your favorite coffee in the comfort of your home";
    }

    @Override
    public double getPrice() {
        return 11.99;
    }
    public String toString(){
        return(name() + "\n" + "Description: "+ getFeature() + "\nPrice: " + getPrice());
    }


}
