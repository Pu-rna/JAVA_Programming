// Define the Complex class to represent complex numbers
class Complex {
    int a, b; // Member variables to store the real and imaginary parts of the complex number

    // Constructor to initialize the complex number with real (a) and imaginary (b) parts
    public Complex(int a, int b) {
        this.a = a; // Set the real part of the complex number
        this.b = b; // Set the imaginary part of the complex number
    }

    // Method to add two complex numbers
    // Takes another Complex object as an argument and returns a new Complex object representing the sum
    public Complex add(Complex other) {
        // Create and return a new Complex number that is the sum of this complex number and the other
        return new Complex(this.a + other.a, this.b + other.b);
    }

    // Method to subtract two complex numbers
    // Takes another Complex object as an argument and returns a new Complex object representing the difference
    public Complex sub(Complex other) {
        // Create and return a new Complex number that is the difference of this complex number and the other
        return new Complex(this.a - other.a, this.b - other.b);
    }

    // Method to display the complex number in the form "a + bi" or "a - bi"
    public void display() {
        // Check if the imaginary part is non-negative
        if (b >= 0) {
            System.out.println(a + " + " + b + "i"); // Print in the form "a + bi"
        } else {
            System.out.println(a + " - " + (-b) + "i"); // Print in the form "a - bi"
        }
    }

    // Main method to test the Complex class functionality
    public static void main(String[] args) {
        // Create two Complex objects representing the complex numbers 3 + 2i and 1 + 7i
        Complex c1 = new Complex(3, 2); // First complex number: 3 + 2i
        Complex c2 = new Complex(1, 7); // Second complex number: 1 + 7i

        // Perform addition of c1 and c2
        Complex sum = c1.add(c2); // Call the add method to calculate the sum of c1 and c2
        System.out.print("Sum: "); // Print label for the sum
        sum.display(); // Display the result of the addition

        // Perform subtraction of c1 and c2
        Complex difference = c1.sub(c2); // Call the sub method to calculate the difference of c1 and c2
        System.out.print("Difference: "); // Print label for the difference
        difference.display(); // Display the result of the subtraction
    }
}
