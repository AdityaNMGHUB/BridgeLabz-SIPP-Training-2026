// Problem 2: Calculate Factorial
// Write a recursive function to calculate the factorial of a number.
// Input:
// 5

// Output:
// 120


// public class Factorial{

//     static int factorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }

//         return n * factorial(n - 1);
//     }

//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }
// }


public class Factorial {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        if (isPrime(n)) {
            System.out.println("Factorial = " + factorial(n));
        } else {
            System.out.println("Number is not prime");
        }
    }
}