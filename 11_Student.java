// Interface for CCA Score
interface CCA_Score {
    // CCA credit data member, representing the credit points for co-curricular activities
    int cca_cred = 10; 

    // Method to display CCA credit; classes implementing this interface must define this method
    void show_cca_cred();
}

// Base class representing a Student
class Student {
    // Attributes to store the student's name and roll number
    String name;
    int roll_no;

    // Method to get data for a student
    void get_data(String name, int roll_no) {
        this.name = name; // Assigning the name
        this.roll_no = roll_no; // Assigning the roll number
    }

    // Method to display student data
    void put_data() {
        System.out.println("Name: " + name); // Displaying the name
        System.out.println("Roll No: " + roll_no); // Displaying the roll number
    }
}

// Sub-class Test_marks that extends the Student class
class Test_marks extends Student {
    // Attributes to store marks for two tests
    float marks1, marks2;

    // Method to get test marks for the student
    void get_marks(float marks1, float marks2) {
        this.marks1 = marks1; // Assigning marks for test 1
        this.marks2 = marks2; // Assigning marks for test 2
    }

    // Method to display test marks
    void put_marks() {
        System.out.println("Marks 1: " + marks1); // Displaying marks for test 1
        System.out.println("Marks 2: " + marks2); // Displaying marks for test 2
    }
}

// Sub-class Sem_Result that inherits from Test_marks and implements CCA_Score interface
class Sem_Result extends Test_marks implements CCA_Score {
    // Implementing the show_cca_cred method from CCA_Score interface
    public void show_cca_cred() {
        // Displaying the CCA credit value
        System.out.println("CCA Credit: " + cca_cred); 
    }

    // Method to display all details of the student
    void display() {
        put_data(); // Displaying student data
        put_marks(); // Displaying test marks
        show_cca_cred(); // Displaying CCA credit
    }
}

// Driver class to test the implementation
class Main {
    public static void main(String[] args) {
        // Creating objects for two students
        Sem_Result student1 = new Sem_Result(); // First student object
        Sem_Result student2 = new Sem_Result(); // Second student object

        // Setting data for student 1
        student1.get_data("Rounak", 1); // Assigning name and roll number
        student1.get_marks(85, 90); // Assigning test marks

        // Setting data for student 2
        student2.get_data("Aditya", 2); // Assigning name and roll number
        student2.get_marks(78, 88); // Assigning test marks

        // Displaying details for both students
        System.out.println("Details of Student 1:");
        student1.display(); // Displaying data for student 1

        System.out.println("\nDetails of Student 2:");
        student2.display(); // Displaying data for student 2
    }
}
