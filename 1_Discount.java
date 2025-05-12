class Discount {
    // Private member variables to store sales amount and discounts
    private double SalesAmount; // Stores the total sales amount
    private double Disc1;       // Stores the discount calculated using if-else
    private double Disc2;       // Stores the discount calculated using the ternary operator
    
    // Constructor to initialize the SalesAmount when an object is created
    // This is a parameterized constructor that takes a sales amount as an argument
    public Discount(double SalesAmount) {
        this.SalesAmount = SalesAmount; // Set the sales amount to the provided value
    }

    // Default constructor
    public Discount() {
        // No initialization for SalesAmount; it will default to 0.0
    }

    // Method to calculate discount using if-else statements
    public void cal_discount1() {
        // Check the sales amount and calculate the discount accordingly
        if (SalesAmount < 10000) {
            Disc1 = 0; // No discount for sales less than 10,000
        } else if (SalesAmount >= 10000 && SalesAmount < 20000) {
            Disc1 = SalesAmount * 0.04; // 4% discount for sales between 10,000 and 20,000
        } else if (SalesAmount >= 20000 && SalesAmount < 40000) {
            Disc1 = SalesAmount * 0.06; // 6% discount for sales between 20,000 and 40,000
        } else {
            Disc1 = SalesAmount * 0.10; // 10% discount for sales 40,000 and above
        }
    }

    // Method to calculate discount using a ternary operator
    public void cal_discount2() {
        // Use the ternary operator to calculate the discount based on sales amount
        Disc2 = SalesAmount < 10000 ? 0 :
                (SalesAmount >= 10000 && SalesAmount < 20000) ? SalesAmount * 0.04 :
                (SalesAmount >= 20000 && SalesAmount < 40000) ? SalesAmount * 0.06 :
                SalesAmount * 0.10;
    }

    // Method to display the sales amount and calculated discounts
    public void display() {
        System.out.println("Sales Amount is " + SalesAmount); // Print the sales amount
        System.out.println("Discount using if-else is " + Disc1); // Print the discount calculated with if-else
        System.out.println("Discount using ternary is " + Disc2); // Print the discount calculated with ternary operator
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create an instance of Discount with a sales amount of 10,000
        // This calls the parameterized constructor Discount(double SalesAmount)
        Discount discount = new Discount(10000);
        
        // Create another instance of Discount with a sales amount of 60,000
        // This also calls the parameterized constructor
        Discount dis_count = new Discount(60000);
        
        // Calculate and display discounts for the first instance
        discount.cal_discount1(); // Calculate discount using if-else
        discount.cal_discount2();  // Calculate discount using ternary
        discount.display();         // Display the results
        
        // Calculate and display discounts for the second instance
        dis_count.cal_discount1(); // Calculate discount using if-else
        dis_count.cal_discount2();  // Calculate discount using ternary
        dis_count.display();         // Display the results
        
        // Create a default Discount instance with no sales amount
        // This calls the default constructor Discount()
        Discount dis_count1 = new Discount();
        dis_count1.display();       // Display the results (sales amount will be 0)
    }
}
