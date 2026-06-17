import java.util.*;

public class sumprogram {

    public static int recursionSum(int n) {
        if (n == 0) return 0;
        return n + recursionSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) return;

        System.out.println(recursionSum(n));
        System.out.println(formulaSum(n));
    }
}