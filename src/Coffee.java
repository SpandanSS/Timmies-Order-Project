public class Coffee implements TimsConsumable {
    public static int total = 0;
    @Override
    public String name() {
        return "Coffee";
    }
    @Override
    public int getCalories() {
        return 80;
    }
    @Override
    public double getPrice() {
        return 1.99;
    }
    public String toString(){
        return(name() + "\n" + "Calories: "+ getCalories() + "\nPrice: " + getPrice());
    }


}
