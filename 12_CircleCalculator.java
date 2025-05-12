import java.util.Scanner; // Importing the Scanner class for user input

// Class that contains methods for mathematical operations related to circles
class Math_operations {
    // Method to calculate the area of a circle given its radius
    public double calculateArea(double radius) {
        return Math.PI * radius * radius; // Area = π * r^2
    }

    // Method to calculate the perimeter (circumference) of a circle given its radius
    public double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius; // Perimeter = 2 * π * r
    }
}

// Class to run the Circle Calculator application
class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read user input
        Math_operations mathOps = new Math_operations(); // Creating an instance of Math_operations class

        // Prompting the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble(); // Reading the radius input from the user

        // Calculating the area of the circle using the method from Math_operations class
        double area = mathOps.calculateArea(radius);
        // Calculating the perimeter of the circle using the method from Math_operations class
        double perimeter = mathOps.calculatePerimeter(radius);

        // Displaying the calculated area and perimeter with two decimal points
        System.out.printf("Area of the circle: %.2f%n", area); // Output the area
        System.out.printf("Perimeter of the circle: %.2f%n", perimeter); // Output the perimeter

        scanner.close(); // Closing the scanner to free up resources
    }
}
