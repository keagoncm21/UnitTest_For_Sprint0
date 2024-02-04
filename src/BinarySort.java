//Code from https://www.geeksforgeeks.org/java-program-for-binary-insertion-sort/

import java.util.Arrays;

public class BinarySort {

    public static void main(String[] args) {
        // Initialize an array for testing
        final int[] arr = {37, 23, 0, 17, 12, 72, 31, 46, 100, 88, 54};

        // Create an instance of BinarySort and sort the array
        new BinarySort().sort(arr);

        // Print the sorted array
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    // Sorts the given array using binary sort algorithm
    public void sort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];

            // Find location to insert using binary search
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);

            // Shifting array to one location right
            System.arraycopy(array, j, array, j + 1, i - j);

            // Placing element at its correct location
            array[j] = x;
        }
    }
}
