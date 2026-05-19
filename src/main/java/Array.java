import java.util.Arrays;

class SortAndCount {
    public static void main(String[] args) {
        int arr[] = {28, 4, 32, 78, 5, 23, 90, 5, 56, 5, 4};
        int n = arr.length;

        // Step 1: Sort the array so identical numbers sit next to each other
        // Array becomes: {4, 4, 5, 5, 5, 23, 28, 32, 56, 78, 90}
        Arrays.sort(arr);

        System.out.println("number|count");
        System.out.println("-------------------");

        // Step 2: Initialize our simple counter
        int count = 1;

        // Step 3: Loop through the array up to the second-to-last element
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                // If the next element is a duplicate, just increment our counter
                count++;
            } else
            {
                // If the next element is different, the current streak ends.
                // Print the result and reset the counter back to 1.
                System.out.println(arr[i] + "\t| " + count);
                count = 1;
            }
        }

        // Step 4: Edge Case - Always print the very last element of the array

    }
}