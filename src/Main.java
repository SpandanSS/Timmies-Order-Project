import java.util.*;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static List<TimsItem> item = new ArrayList<>();
    static int count = 0; //var to index through the arraylist & keep track of total items for checkout()
    public static void main(String[] args) {
        int choice = 0;
        //get user input to choose b/w consumable or merch and call appropriate methods
        while (choice != 3) {
            System.out.println("Select order type:\n1.Consumables\n2.Merchandise\n3.Finish order\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    consumables();
                    break;
                case 2:
                    merchandise();
                    break;
                case 3:
                    checkout();
                    break;
                default:
                    System.out.println("Enter correct input");
                    break;
            }
        }
    }
    //initialize consumable objects, show product details then confirm with user & increment counters
    public static void consumables() {
        System.out.println("Choose your consumable:\n1.Coffee \n2.Donut \n3.Sandwich\n4.Go back\n");
        switch (scanner.nextInt()) {
            case 1:
                item.add(count, new Coffee());
                System.out.println(item.get(count).toString());
                if (confirm()) {
                    count++; Coffee.total++;
                } else {
                    item.set(count, null);
                }
                break;
            case 2:
                item.add(count, new Donut());
                System.out.println(item.get(count).toString());
                if (confirm()) {
                    Donut.total++; count++;
                } else {
                    item.set(count, null);
                }
                break;
            case 3:
                item.add(count, new Sandwich());
                System.out.println(item.get(count).toString());
                if (confirm()) {
                    count++; Sandwich.total++;
                } else {
                    item.set(count, null);
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Enter correct input\n**");
        }
    }
    //initialize merch objects, show product details then confirm with user & increment counters
    public static void merchandise() {
        System.out.println("Choose your merchandise:\n1.Coffee powder \n2.Mug \n3.Gift Card\n4.Go back\n");
        switch (scanner.nextInt()) {
            case 1:
                item.add(count, new CoffeePowder());
                System.out.println(item.get(count).toString());
                if (confirm()) {
                    count++; CoffeePowder.total++;
                } else {
                    item.set(count, null);
                }
                break;
            case 2:
                item.add(count, new Mug());
                System.out.println(item.get(count).toString());
                if (confirm()) {
                    count++; Mug.total++;
                } else {
                    item.set(count, null);
                }
                break;
            case 3:
                item.add(count, new GiftCard());
                System.out.println(item.get(count).toString());
                if (confirm()) {
                    count++; GiftCard.total++;
                } else {
                    item.set(count, null);
                }
                break;
            case 4:
                break;
            default:
                System.out.println("Enter correct input\n**");
        }
    }
    public static boolean confirm() {
        System.out.println("Confirm choice?\n1.Yes \n2.No ");
        return scanner.nextInt() == 1;
    }
    public static void checkout() {
        //call getPrice method for existing objects and store in a var to modify and print later
        double total = 0;
        System.out.println("Total items: " + count);
        for(int i = 0; i<count;i++){
            total += item.get(i).getPrice();
        }
        // print the items ordered with their count and total price with tax
        System.out.println("Items ordered: ");
        while(count>0){
            if (Coffee.total > 0){
                System.out.println(Coffee.total + " Coffee");
                Coffee.total = 0;
            }
            if (CoffeePowder.total > 0){
                System.out.println(CoffeePowder.total + " Coffee Powder");
                CoffeePowder.total = 0;
            }
            if (Donut.total > 0){
                System.out.println(Donut.total + " Donut");
                Donut.total = 0;
            }
            if (GiftCard.total > 0){
                System.out.println(GiftCard.total + " Gift card");
                GiftCard.total = 0;
            }
            if (Mug.total > 0){
                System.out.println(Mug.total + " Mug");
                Mug.total = 0;
            }
            if (Sandwich.total > 0){
                System.out.println(Sandwich.total + " Sandwich");
                Sandwich.total = 0;
            }
            count--;
        }

        /*for (int i = 0; i < count; i++) {
            total += item[i].getPrice();
            if (item[i] instanceof Coffee) {
                System.out.println(Coffee.total + " Coffees");
            }
            if (item[i] instanceof CoffeePowder) {
                System.out.println(CoffeePowder.total + " Coffee Powder");
            }
            if (item[i] instanceof Donut) {
                System.out.println(Donut.total + " Donuts");
            }
            if (item[i] instanceof GiftCard) {
                System.out.println(GiftCard.total + " Gift Cards");
            }
            if (item[i] instanceof Mug) {
                System.out.println(Mug.total + " Mugs");
            }
            if (item[i] instanceof Sandwich) {
                System.out.println(Sandwich.total + " Sandwiches");
            }
        }*/
        total += total*.13;
        System.out.printf("\nTotal with tax: $%.2f", total);
        System.out.println("\nThank-you for choosing Tim Hortons\n***");
    }
}

