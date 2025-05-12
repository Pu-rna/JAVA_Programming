// Define the interface
interface Area {
    // Constant for pi, which will be used in area calculations
    final static float pi = 3.14F;

    // Method signature for calculating area; subclasses must implement this method
    void cal_area(float dim1, float dim2);
}

// Implementing the Circle class
class Circle implements Area {
    // Implement the cal_area method for Circle
    public void cal_area(float radius, float dim2) {
        // Calculate the area of the circle using the formula: π * radius^2
        float area = pi * radius * radius; 
        System.out.println("Area of Circle: " + area); // Display the calculated area
    }
}

// Implementing the Rectangle class
class Rectangle implements Area {
    // Implement the cal_area method for Rectangle
    public void cal_area(float length, float breadth) {
        // Calculate the area of the rectangle using the formula: length * breadth
        float area = length * breadth; 
        System.out.println("Area of Rectangle: " + area); // Display the calculated area
    }
}

// Driver class to test the implementation
class Main {
    public static void main(String[] args) {
        // Using the Area interface reference to point to Circle object
        Area circle = new Circle(); // Create an instance of Circle
        circle.cal_area(5, 0); // Call cal_area with radius = 5; dim2 is not used

        // Using the Area interface reference to point to Rectangle object
        Area rectangle = new Rectangle(); // Create an instance of Rectangle
        rectangle.cal_area(4, 7); // Call cal_area with length = 4 and breadth = 7
    }
}
