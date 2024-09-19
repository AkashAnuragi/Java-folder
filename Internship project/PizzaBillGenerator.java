import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


abstract class Pizza {
    protected String name;
    protected double basePrice;
    protected boolean extraCheese;
    protected boolean extraToppings;

    public Pizza(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
        this.extraCheese = false;
        this.extraToppings = false;
    }

    public void addExtraCheese() {
        this.extraCheese = true;
    }

    public void addExtraToppings() {
        this.extraToppings = true;
    }

    public abstract double calculatePrice();

    @Override
    public String toString() {
        return name + " - Base Price: $" + basePrice +
                (extraCheese ? ", Extra Cheese: 30.00 Rs" : "") +
                (extraToppings ? ", Extra Toppings: 45.00 Rs" : "");
    }
}

class VegPizza extends Pizza {
    public VegPizza() {
        super("Veg Pizza", 299.00);
    }

    @Override
    public double calculatePrice() {
        double price = basePrice;
        if (extraCheese) price += 30.00;
        if (extraToppings) price += 45.00;
        return price;
    }
}

class NonVegPizza extends Pizza {
    public NonVegPizza() {
        super("Non-Veg Pizza", 399.00);
    }

    @Override
    public double calculatePrice() {
        double price = basePrice;
        if (extraCheese) price += 30.00;
        if (extraToppings) price += 45.00;
        return price;
    }
}

class DeluxeVegPizza extends Pizza {
    public DeluxeVegPizza() {
        super("Deluxe Veg Pizza", 469.00);
        this.extraCheese = true;
        this.extraToppings = true;
    }

    @Override
    public double calculatePrice() {
        return basePrice + 30.00 + 45.00; // basePrice + extraCheese + extraToppings
    }
}

class DeluxeNonVegPizza extends Pizza {
    public DeluxeNonVegPizza() {
        super("Deluxe Non-Veg Pizza", 599.00);
        this.extraCheese = true;
        this.extraToppings = true;
    }

    @Override
    public double calculatePrice() {
        return basePrice + 30.00 + 45.00; // basePrice + extraCheese + extraToppings
    }
}
 

class Bill {
    private List<Pizza> pizzas;
    private double totalAmount;
    private boolean takeAway;

    public Bill() {
        pizzas = new ArrayList<>();
        totalAmount = 0;
        takeAway = false;
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
        totalAmount += pizza.calculatePrice();
    }

    public void optForTakeAway() {
        takeAway = true;
        totalAmount += 10; // Packaging charge
    }

    public void generateBill() {
        System.out.println("---------- Pizza Bill ----------");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
        System.out.println("--------------------------------");
        if (takeAway) {
            System.out.println("Packaging Charges: 10Rs");
        }
        System.out.printf("Total Amount: Rs. %.2f\n", totalAmount);
        System.out.println("Thank you for your order!");
    }
}


public class PizzaBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bill bill = new Bill();

        while (true) {
            System.out.println("Select type of pizza:");
            System.out.println("1. Veg Pizza");
            System.out.println("2. Non-Veg Pizza");
            System.out.println("3. Deluxe Veg Pizza");
            System.out.println("4. Deluxe Non-Veg Pizza");
            int choice = scanner.nextInt();

            Pizza pizza;
            switch (choice) {
                case 1:
                    pizza = new VegPizza();
                    askForExtras(pizza, scanner);
                    break;
                case 2:
                    pizza = new NonVegPizza();
                    askForExtras(pizza, scanner);
                    break;
                case 3:
                    pizza = new DeluxeVegPizza();
                    break;
                case 4:
                    pizza = new DeluxeNonVegPizza();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            bill.addPizza(pizza);

            System.out.println("Do you want to order another pizza? (yes/no)");
            scanner.nextLine(); // consume newline
            String anotherPizza = scanner.nextLine();

            if (anotherPizza.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Do you want to opt for take away? (yes/no)");
        String takeAway = scanner.nextLine();
        if (takeAway.equalsIgnoreCase("yes")) {
            bill.optForTakeAway();
        }

        bill.generateBill();
    }

    private static void askForExtras(Pizza pizza, Scanner scanner) {
        System.out.println("Do you want extra cheese? (yes/no)");
        if (scanner.next().equalsIgnoreCase("yes")) {
            pizza.addExtraCheese();
        }

        System.out.println("Do you want extra toppings? (yes/no)");
        if (scanner.next().equalsIgnoreCase("yes")) {
            pizza.addExtraToppings();
        }
    }
}
