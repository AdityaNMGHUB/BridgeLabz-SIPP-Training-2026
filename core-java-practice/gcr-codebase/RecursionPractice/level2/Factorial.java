// Problem 2: Calculate Factorial
// Write a recursive function to calculate the factorial of a number.
// Input:
// 5

// Output:
// 120


public class Factorial{

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}