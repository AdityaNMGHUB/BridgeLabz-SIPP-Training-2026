import java.util.*;

class ArrayIndexOutOfBoundsDemo {

    static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException Handled");
        }
    }

    public static void main(String[] args) {

        String[] names = {"Ram", "Shyam", "Mohan"};

        handleException(names);
    }
}