// Define the Student class to represent a student with various attributes
class Student {
    // Data members to store student details
    private String S_Name;       // Student's name
    private int Roll_No;         // Student's roll number
    private String Batch;        // Student's batch
    private int Year_of_Adm;     // Year of admission
    private String Stream;       // Student's stream of study

    // Default constructor initializes all fields with default values
    public Student() {
        this("Not Assigned", 0, "Not Assigned", 0, "Not Assigned"); // Calls the main constructor with default values
    }

    // Constructor with two parameters for name and roll number
    public Student(String S_Name, int Roll_No) {
        this(S_Name, Roll_No, "Not Assigned", 0, "Not Assigned"); // Calls the main constructor with default values for other fields
    }

    // Constructor with three parameters: name, roll number, and batch
    public Student(String S_Name, int Roll_No, String Batch) {
        this(S_Name, Roll_No, Batch, 0, "Not Assigned"); // Calls the main constructor with default values for other fields
    }

    // Constructor with four parameters: name, roll number, batch, and year of admission
    public Student(String S_Name, int Roll_No, String Batch, int Year_of_Adm) {
        this(S_Name, Roll_No, Batch, Year_of_Adm, "Not Assigned"); // Calls the main constructor with a default value for stream
    }

    // Constructor with five parameters: name, roll number, batch, year of admission, and stream
    public Student(String S_Name, int Roll_No, String Batch, int Year_of_Adm, String Stream) {
        this.S_Name = S_Name;           // Initialize name
        this.Roll_No = Roll_No;         // Initialize roll number
        this.Batch = Batch;             // Initialize batch
        this.Year_of_Adm = Year_of_Adm; // Initialize year of admission
        this.Stream = Stream;           // Initialize stream
    }

    // Method to display the data members of the student
    public void showData() {
        System.out.println("Name: " + S_Name);               // Display student's name
        System.out.println("Roll No: " + Roll_No);           // Display student's roll number
        System.out.println("Batch: " + Batch);               // Display student's batch
        System.out.println("Year of Admission: " + Year_of_Adm); // Display year of admission
        System.out.println("Stream: " + Stream);             // Display student's stream
    }

    // Main method to test the Student class
    public static void main(String[] args) {
        // Creating Student objects using different constructors
        Student studentDefault = new Student(); // Using default constructor
        Student student1 = new Student("Alice", 101); // Using two-parameter constructor
        Student student2 = new Student("Bob", 102, "Batch A"); // Using three-parameter constructor
        Student student3 = new Student("Charlie", 103, "Batch B", 2021); // Using four-parameter constructor
        Student student4 = new Student("David", 104, "Batch C", 2022, "Science"); // Using five-parameter constructor

        // Displaying data for each student
        System.out.println("Default Student Details:");
        studentDefault.showData(); // Show data for the default student

        System.out.println("\nStudent 1 Details:");
        student1.showData(); // Show data for student1

        System.out.println("\nStudent 2 Details:");
        student2.showData(); // Show data for student2

        System.out.println("\nStudent 3 Details:");
        student3.showData(); // Show data for student3

        System.out.println("\nStudent 4 Details:");
        student4.showData(); // Show data for student4
    }
}
