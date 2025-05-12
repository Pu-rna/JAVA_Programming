import java.util.Scanner; // Import Scanner class for user input

// Class to perform matrix multiplication
class MatrixMultiplication {
    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        System.out.println("Enter the number of rows and columns of the first matrix: ");
        int rows1 = scanner.nextInt(); // Read the number of rows for the first matrix
        int cols1 = scanner.nextInt(); // Read the number of columns for the first matrix
        int[][] matrix1 = new int[rows1][cols1]; // Initialize the first matrix
        System.out.println("Enter the elements of the first matrix:");
        
        // Loop to read elements of the first matrix
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt(); // Store user input in the matrix
            }
        }

        // Input for the second matrix
        System.out.println("Enter the number of rows and columns of the second matrix: ");
        int rows2 = scanner.nextInt(); // Read the number of rows for the second matrix
        int cols2 = scanner.nextInt(); // Read the number of columns for the second matrix
        int[][] matrix2 = new int[rows2][cols2]; // Initialize the second matrix
        System.out.println("Enter the elements of the second matrix:");
        
        // Loop to read elements of the second matrix
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt(); // Store user input in the matrix
            }
        }

        // Check if matrix multiplication is possible
        if (cols1 != rows2) { // Matrix multiplication is possible if cols of first = rows of second
            System.out.println("Matrix multiplication is not possible."); // Inform the user
            return; // Exit the program
        }

        // Perform matrix multiplication
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2, rows1, cols2, cols1);

        // Print the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(resultMatrix[i][j] + " "); // Print each element of the resultant matrix
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int rows1, int cols2, int commonDim) {
        // Initialize the resultant matrix to store the product
        int[][] result = new int[rows1][cols2];
        
        // Loop through each row of the first matrix
        for (int i = 0; i < rows1; i++) {
            // Loop through each column of the second matrix
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0; // Initialize the current element in the result matrix
                // Loop through the common dimension to calculate the sum of products
                for (int k = 0; k < commonDim; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j]; // Add the product to the current element
                }
            }
        }
        return result; // Return the resultant matrix
    }
}
