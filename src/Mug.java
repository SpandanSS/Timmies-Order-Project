public class Mug implements TimsMerchandise {
    public static int total = 0;
    @Override
    public String name() {
        return "Mug";
    }
    @Override
    public String getFeature() {
        return "Red and black, chip resistant";
    }

    @Override
    public double getPrice() {
        return 15;
    }

    public String toString(){
        return(name() + "\n" + "Description: "+ getFeature() + "\nPrice: " + getPrice());
    }


}
