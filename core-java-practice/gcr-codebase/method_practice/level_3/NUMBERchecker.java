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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += digit;
        }

        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;

        for (int digit : digits) {
            sum += (int) Math.pow(digit, 2);
        }

        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);

        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];

        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }
}

public class NUMBERchecker {
    public static void main(String[] args) {

        int number = 21;

        int count = NumberChecker.countDigits(number);
        int[] digits = NumberChecker.storeDigits(number);

        System.out.println("Number = " + number);
        System.out.println("Count of Digits = " + count);

        System.out.print("Digits Array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Sum of Digits = " +
                NumberChecker.sumOfDigits(digits));

        System.out.println("Sum of Squares of Digits = " +
                NumberChecker.sumOfSquares(digits));

        System.out.println("Harshad Number = " +
                NumberChecker.isHarshadNumber(number, digits));

        int[][] frequency = NumberChecker.digitFrequency(digits);

        System.out.println("Digit\tFrequency");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(
                        frequency[i][0] + "\t" + frequency[i][1]);
            }
        }
    }
}