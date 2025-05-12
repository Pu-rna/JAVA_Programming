// Base class representing a general shape
class Shape {
    int dimension1, dimension2; // Dimensions of the shape (for 2D shapes)

    // Method to set dimensions for shapes with two dimensions
    void get(int d1, int d2) {
        // Validate the dimensions to ensure they are positive
        if (d1 <= 0 || d2 <= 0) {
            System.out.println("Invalid input. Dimensions must be positive.");
            return; // Exit the method if dimensions are invalid
        }
        dimension1 = d1; // Assign the first dimension
        dimension2 = d2; // Assign the second dimension
    }

    // Method to display the dimensions of the shape
    void put() {
        System.out.println("Dimension 1: " + dimension1); // Print first dimension
        System.out.println("Dimension 2: " + dimension2); // Print second dimension
    }

    // Method to calculate area (to be overridden in subclasses)
    double calArea() {
        return 0; // Default implementation returns 0; should be overridden
    }
}

// Subclass representing a square, inherits from Shape
class Square extends Shape {
    // Method to set dimensions specifically for squares (only one side length)
    void get(int side) {
        // Validate the side length to ensure it is positive
        if (side <= 0) {
            System.out.println("Invalid input. Side must be positive.");
            return; // Exit the method if side length is invalid
        }
        dimension1 = side; // dimension1 holds the side length
        dimension2 = side; // dimension2 is the same as dimension1 for a square
    }

    // Override method to calculate the area of a square
    double calArea() {
        return dimension1 * dimension1; // Area = side^2
    }
}

// Subclass representing a rectangle, inherits from Shape
class Rectangle extends Shape {
    // Override method to calculate the area of a rectangle
    double calArea() {
        return dimension1 * dimension2; // Area = length * width
    }
}

// Subclass representing a triangle, inherits from Shape
class Triangle extends Shape {
    // Override method to calculate the area of a triangle
    double calArea() {
        return 0.5 * dimension1 * dimension2; // Area = 0.5 * base * height
    }
}

// Main class to test the shape classes
class Main {
    public static void main(String[] args) {
        // Creating a Square object
        Square square = new Square();
        square.get(5); // Set side length to 5
        square.put(); // Display dimensions of the square
        System.out.println("Area of Square: " + square.calArea()); // Calculate and display area of the square

        // Creating a Rectangle object
        Rectangle rectangle = new Rectangle();
        rectangle.get(5, 10); // Set dimensions to 5 (length) and 10 (width)
        rectangle.put(); // Display dimensions of the rectangle
        System.out.println("Area of Rectangle: " + rectangle.calArea()); // Calculate and display area of the rectangle

        // Creating a Triangle object
        Triangle triangle = new Triangle();
        triangle.get(5, 8); // Set base to 5 and height to 8
        triangle.put(); // Display dimensions of the triangle
        System.out.println("Area of Triangle: " + triangle.calArea()); // Calculate and display area of the triangle
    }
}
