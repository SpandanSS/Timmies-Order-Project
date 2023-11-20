public class GiftCard implements TimsMerchandise {
    public static int total = 0;
    @Override
    public String name() {
        return "Gift Card";
    }
    @Override
    public String getFeature() {
        return "Link with our app and recharge amount";
    }
    @Override
    public double getPrice() {
        return 10;
    }
    @Override
    public String toString(){
        return(name() + "\n" + "Description: "+ getFeature() + "\nPrice: " + getPrice());
    }


}
