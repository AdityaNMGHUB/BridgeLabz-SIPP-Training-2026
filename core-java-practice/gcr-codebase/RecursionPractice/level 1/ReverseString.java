// Problem 4: Reverse a String Using Recursion
// Write a recursive function to reverse a given string.
// Input:
// hello

// Output:
// olleh

public class ReverseString {

    static String reverse(String str) {
        if (str.length() == 0) {
            return "";
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}