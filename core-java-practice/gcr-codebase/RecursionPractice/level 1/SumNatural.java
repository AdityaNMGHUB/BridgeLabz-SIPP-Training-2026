// Problem 3: Sum of First N Natural Numbers
// Find the sum of first N natural numbers using recursion.
// Input:
// N = 5

// Output:
// 15



public class SumNatural {

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}