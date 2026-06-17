import java.util.Random;

public class FootballTeam {

    // Method to find sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {

        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights between 150 and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        // Display player heights
        System.out.println("Player Heights:");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }

        // Display results
        System.out.println("\nResults:");
        System.out.println("Sum of Heights = " + findSum(heights) + " cm");
        System.out.println("Mean Height = " + findMean(heights) + " cm");
        System.out.println("Shortest Height = " + findShortest(heights) + " cm");
        System.out.println("Tallest Height = " + findTallest(heights) + " cm");
    }
}