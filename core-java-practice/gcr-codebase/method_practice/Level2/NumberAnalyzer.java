import java.util.*;

public class NumberAnalyzer {

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : arr) {
            if (x >= 0) {
                if (x % 2 == 0) System.out.println(x + " Positive Even");
                else System.out.println(x + " Positive Odd");
            } else {
                System.out.println(x + " Negative");
            }
        }

        System.out.println(compare(arr[0], arr[4]));
    }
}