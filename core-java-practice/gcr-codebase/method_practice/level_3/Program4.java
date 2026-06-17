class NumberChecker {

    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        return count;
    }

    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }

        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }

        return reversed;
    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return compareArrays(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }

        return false;
    }
}

public class Program4 {
    public static void main(String[] args) {

        int number = 12021;

        int count = NumberChecker.countDigits(number);
        int[] digits = NumberChecker.storeDigits(number);

        System.out.println("Number = " + number);
        System.out.println("Count of Digits = " + count);

        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] reversed = NumberChecker.reverseArray(digits);

        System.out.print("Reversed Array: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Arrays Equal = " +
                NumberChecker.compareArrays(digits, reversed));

        System.out.println("Palindrome Number = " +
                NumberChecker.isPalindrome(digits));

        System.out.println("Duck Number = " +
                NumberChecker.isDuckNumber(digits));
    }
}