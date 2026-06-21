import java.util.Scanner;

class Calculator {

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("Addition: " + c);
    }

    public void subtract(int a, int b) {
        int c = a - b;
        System.out.println("Subtraction: " + c);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Calculator calc = new Calculator();

            System.out.println("Enter your choice:");
            System.out.println("1. Add\n2. Subtract\n3. Divide\n4. Multiply");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    calc.add(10, 20);
                    break;

                case 2:
                    calc.subtract(30, 10);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}