// Problem 7: Calculate Power(x,n)
// Compute xⁿ using recursion.
// Input:
// x = 2
// n = 5

// Output:
// 32


public class Power {

    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}