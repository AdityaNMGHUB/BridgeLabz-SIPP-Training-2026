import java.util.*;
public class reverseREcursion {
    static String reverse(String str) {
        if (str.length() == 0) {
            return "";
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your string : ");
        String str = sc.next();

        System.out.println(reverse(str));
    }
}
