import java.util.Scanner; // Import the Scanner class for user input

// Class to demonstrate Bubble Sort algorithm
class BubbleSort {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of elements in the array
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt(); // Read the number of elements
        
        // Create an array to hold the integers
        int[] array = new int[n];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt(); // Read each element into the array
        }

        // Call the bubble sort method to sort the array
        bubbleSort(array);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : array) {
            System.out.print(num + " "); // Print each number in the sorted array
        }
        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to perform Bubble Sort on the array
    public static void bubbleSort(int[] array) {
        int n = array.length; // Get the length of the array
        // Outer loop for each pass through the array
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                // Compare the current element with the next element
                if (array[j] > array[j + 1]) {
                    // If the current element is greater, swap the elements
                    int temp = array[j]; // Store the current element in a temporary variable
                    array[j] = array[j + 1]; // Assign the next element to the current position
                    array[j + 1] = temp; // Assign the value from the temporary variable to the next position
                }
            }
        }
    }
}
