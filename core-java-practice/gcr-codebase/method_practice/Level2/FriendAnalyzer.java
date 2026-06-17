import java.util.*;

public class FriendAnalyzer {

    public static int youngest(int[] age) {
        int min = age[0];
        for (int a : age) if (a < min) min = a;
        return min;
    }

    public static int tallest(int[] h) {
        int max = h[0];
        for (int x : h) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        int[] height = new int[3];

        for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) height[i] = sc.nextInt();

        System.out.println(youngest(age));
        System.out.println(tallest(height));
    }
}