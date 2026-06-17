class NumberChecker {

    public static int sumOfProperDivisors(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }

    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    public static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }
}

public class Program6 {
    public static void main(String[] args) {

        int number = 145;

        System.out.println("Number = " + number);
        System.out.println("Perfect Number = " + NumberChecker.isPerfect(number));
        System.out.println("Abundant Number = " + NumberChecker.isAbundant(number));
        System.out.println("Deficient Number = " + NumberChecker.isDeficient(number));
        System.out.println("Strong Number = " + NumberChecker.isStrong(number));
    }
}