// Problem 10: Generate All Permutations of a String
// Generate all possible permutations of a string recursively.
// Input:
// ABC

// Output:
// ABC
// ACB
// BAC
// BCA5
// CAB
// CBA

public class Permutations{

    static void generate(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            String remaining =
                    str.substring(0, i) +
                    str.substring(i + 1);

            generate(remaining, ans + current);
        }
    }

    public static void main(String[] args) {
        generate("ABC", "");
    }
}