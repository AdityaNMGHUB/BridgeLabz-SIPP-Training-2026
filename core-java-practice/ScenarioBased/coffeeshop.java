import java.util.Scanner;

public class coffeeshop {
    String CoffeeType;
    int Quantity;

    public double CalculatePrice(double price) {
        double bill = price * Quantity;
        double gst = bill * 0.18;
        double finalbill = bill + gst;
        return finalbill;
    }

    public void generateBill(double bill) {
        System.out.println("------------------------------------------------");
        System.out.println("COFFEE TYPE -> " + CoffeeType);
        System.out.println("QUANTITY -> " + Quantity);
        System.out.println("BILL AMOUNT -> " + bill);
        System.out.println("THANK YOU FOR VISIT !!");
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Coffee Type:");
        System.out.println("1. Cappuccino - 150");
        System.out.println("2. Latte - 250");
        System.out.println("3. Espresso - 350");
        System.out.println("4. Americano - 450");
        System.out.println("5. Black Coffee - 80");

        int choice = sc.nextInt();

        coffeeshop coffee = new coffeeshop();

        System.out.print("Enter Quantity: ");
        coffee.Quantity = sc.nextInt();

        switch (choice) {
            case 1:
                coffee.CoffeeType = "Cappuccino";
                coffee.generateBill(coffee.CalculatePrice(150));
                break;

            case 2:
                coffee.CoffeeType = "Latte";
                coffee.generateBill(coffee.CalculatePrice(250));
                break;

            case 3:
                coffee.CoffeeType = "Espresso";
                coffee.generateBill(coffee.CalculatePrice(350));
                break;

            case 4:
                coffee.CoffeeType = "Americano";
                coffee.generateBill(coffee.CalculatePrice(450));
                break;

            case 5:
                coffee.CoffeeType = "Black Coffee";
                coffee.generateBill(coffee.CalculatePrice(80));
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}