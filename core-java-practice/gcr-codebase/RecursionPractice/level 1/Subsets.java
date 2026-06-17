// roblem 8: Generate All Subsets of an Array
// Given an array, generate all possible subsets recursively.
// Input:
// [1,2]

// Output:
// []
// [1]
// [2]
// [1,2]

import java.util.ArrayList;
public class Subsets {

    static void generateSubsets(int[] arr, int index, ArrayList<Integer> current) {

        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        generateSubsets(arr, index + 1, current);
        current.add(arr[index]);
        generateSubsets(arr, index + 1, current);
        current.remove(current.size() - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2};
        ArrayList<Integer> lis = new ArrayList<>();

        generateSubsets(arr, 0, lis);
    }
}

