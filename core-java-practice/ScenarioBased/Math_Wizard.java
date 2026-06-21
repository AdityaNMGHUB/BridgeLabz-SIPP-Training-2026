import java.util.Scanner;

class MathWizard {

    int number = 100;

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
            return false;
        }
        return true;
    }

    public long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public double factorial(double n) {
        double fact = 1;
        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }
        return fact;
    }

    public int fibonacci(int n) {
        if (n <= 1)
            return n;

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public void showScope() {
        int number = 50; // Local Variable

        System.out.println("Local Variable = " + number);
        System.out.println("Instance Variable = " + this.number);
    }
}

public class Math_Wizard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MathWizard mw = new MathWizard();

        System.out.println("===== Math Wizard =====");
        System.out.println("1. Prime Check");
        System.out.println("2. Factorial (int)");
        System.out.println("3. Factorial (double)");
        System.out.println("4. Fibonacci");
        System.out.println("5. GCD");
        System.out.println("6. LCM");
        System.out.println("7. Power");
        System.out.println("8. Scope Demonstration");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter number: ");
                int primeNum = sc.nextInt();
                System.out.println("Result = " + mw.isPrime(primeNum));
                break;

            case 2:
                System.out.print("Enter integer: ");
                int factNum = sc.nextInt();
                System.out.println("Result = " + mw.factorial(factNum));
                break;

            case 3:
                System.out.print("Enter double value: ");
                double d = sc.nextDouble();
                System.out.println("Result = " + mw.factorial(d));
                break;

            case 4:
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                System.out.println("Result = " + mw.fibonacci(n));
                break;

            case 5:
                System.out.print("Enter two numbers: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("GCD = " + mw.gcd(a, b));
                break;

            case 6:
                System.out.print("Enter two numbers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("LCM = " + mw.lcm(x, y));
                break;

            case 7:
                System.out.print("Enter base: ");
                int base = sc.nextInt();

                System.out.print("Enter exponent: ");
                int exp = sc.nextInt();

                System.out.println("Result = " + mw.power(base, exp));
                break;

            case 8:
                mw.showScope();
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}