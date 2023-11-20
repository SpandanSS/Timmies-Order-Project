public class Donut implements TimsConsumable {
    public static int total = 0;

    @Override
    public String name() {
        return "Donut";
    }
    @Override
    public int getCalories() {
        return 420;
    }

    @Override
    public double getPrice() {
        return 2.99;
    }
    public String toString(){
        return(name() + "\n" + "Calories: "+ getCalories() + "\nPrice: " + getPrice());
    }


}
