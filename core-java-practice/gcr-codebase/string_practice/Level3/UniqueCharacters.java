import java.util.*;

class UniqueCharacters {

    static char[] uniqueChars(String text) {

        char[] temp = new char[text.length()];
        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            boolean unique = true;

            for (int j = 0; j < i; j++) {

                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                temp[count++] = text.charAt(i);
            }
        }

        char[] result = new char[count];

        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        char[] result = uniqueChars(text);

        System.out.println("Unique Characters:");

        for (char ch : result) {
            System.out.print(ch + " ");
        }
    }
}