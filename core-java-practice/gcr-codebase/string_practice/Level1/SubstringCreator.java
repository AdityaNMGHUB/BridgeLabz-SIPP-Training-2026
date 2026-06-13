import java.util.*;

class SubstringCreator {

    static String createSubstring(String text, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println(createSubstring(text, start, end));
        System.out.println(text.substring(start, end));
    }
}