// Define the Arithmetic class to perform operations on various data types
class Arithmetic {
    // Member variables to store different types of data
    private int a;     // An integer value
    private float b;   // A float value
    private char c;    // A character value
    private double d;  // A double value

    // Constructor to initialize the Arithmetic object with provided values
    public Arithmetic(int a, float b, char c, double d) {
        this.a = a;   // Set the integer value
        this.b = b;   // Set the float value
        this.c = c;   // Set the character value
        this.d = d;   // Set the double value
    }

    // Method to add an integer and a double to the member variables
    public void add(int x, double y) {
        a += x; // Increment integer a by x
        d += y; // Increment double d by y
    }

    // Method to add an integer, a float, and a double to the member variables
    public void add(int x, float y, double z) {
        a += x; // Increment integer a by x
        b += y; // Increment float b by y
        d += z; // Increment double d by z
    }

    // Method to add a float, an integer, and a double to the member variables
    public void add(float x, int y, double z) {
        b += x; // Increment float b by x
        a += y; // Increment integer a by y
        d += z; // Increment double d by z
    }

    // Method to add another Arithmetic object to the current object
    public Arithmetic add(Arithmetic obj) {
        // Calculate new values by adding the corresponding member variables
        int newA = this.a + obj.a;       // Sum of integer values
        float newB = this.b + obj.b;     // Sum of float values
        char newC = this.c;               // Character remains unchanged (assuming no addition is defined for char)
        double newD = this.d + obj.d;    // Sum of double values
        // Return a new Arithmetic object with the calculated values
        return new Arithmetic(newA, newB, newC, newD);
    }

    // Method to display the values of the member variables
    public void display() {
        // Print the values of a, b, c, and d
        System.out.println("a: " + a + ", b: " + b + ", c: " + c + ", d: " + d);
    }

    // Main method to test the Arithmetic class functionality
    public static void main(String[] args) {
        // Create two Arithmetic objects with initial values
        Arithmetic obj1 = new Arithmetic(5, 3.5f, 'A', 7.8); // First object with values
        Arithmetic obj2 = new Arithmetic(10, 4.5f, 'B', 6.2); // Second object with values

        // Display initial values of obj1
        System.out.println("Initial values of obj1:");
        obj1.display();

        // Display initial values of obj2
        System.out.println("Initial values of obj2:");
        obj2.display();

        // Perform addition of an integer and a double on obj1
        obj1.add(3, 2.2);
        System.out.println("After obj1.add(3, 2.2):"); // Label for the next output
        obj1.display(); // Display the updated values of obj1

        // Perform addition of an integer, a float, and a double on obj1
        obj1.add(2, 1.1f, 1.1);
        System.out.println("After obj1.add(2, 1.1f, 1.1):"); // Label for the next output
        obj1.display(); // Display the updated values of obj1

        // Perform addition of a float, an integer, and a double on obj1
        obj1.add(2.5f, 4, 3.3);
        System.out.println("After obj1.add(2.5f, 4, 3.3):"); // Label for the next output
        obj1.display(); // Display the updated values of obj1

        // Add obj1 and obj2 together and store the result in obj3
        Arithmetic obj3 = obj1.add(obj2);
        System.out.println("After adding obj1 and obj2 into obj3:"); // Label for the next output
        obj3.display(); // Display the values of obj3, which contains the sum of obj1 and obj2
    }
}
