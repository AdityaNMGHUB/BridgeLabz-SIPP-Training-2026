// Problem 9: Solve Tower of Hanoi
// Print all steps required to move N disks from Source to Destination.
// Input:
// N = 3

// Output:
// Move disk 1 from A to C
// Move disk 2 from A to B
// Move disk 1 from C to B
// ...



public class TowerOfHanoi {
    

    static void solve(int n, char source, char helper, char destination) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solve(n - 1, source, destination, helper);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        solve(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        solve(3, 'A', 'B', 'C');
    }
}