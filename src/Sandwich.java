public class Sandwich implements TimsConsumable {
    public static int total = 0;
    @Override
    public String name() {
        return "Sandwich";
    }
    @Override
    public int getCalories() {
        return 200;
    }

    @Override
    public double getPrice() {
        return 7.99;
    }
    public String toString(){
        return(name() + "\n" + "Calories: "+ getCalories() + "\nPrice: " + getPrice());
    }

}
