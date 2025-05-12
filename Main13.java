import ccpackage13.CCA_Score;
import studentpackage13.Student;
// Sub-class Test_marks extending Student
class Test_marks extends Student {
    float marks1, marks2;

    // Method to get test marks
    void get_marks(float marks1, float marks2) {
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    // Method to display test marks
    void put_marks() {
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }
}

// Sub-class Sem_Result inheriting Test_marks and implementing CCA_Score
class Sem_Result extends Test_marks implements CCA_Score {
    // Implementing the show_cca_cred method from CCA_Score interface
    public void show_cca_cred() {
        System.out.println("CCA Credit: " + cca_cred);
    }

    // Method to display all details
    void display() {
        put_data();
        put_marks();
        show_cca_cred();
    }
}

// Driver class to test the implementation
public class Main13 {
    public static void main(String[] args) {
        // Creating objects for two students
        Sem_Result student1 = new Sem_Result();
        Sem_Result student2 = new Sem_Result();

        // Setting data for student 1
        student1.get_data("Rounak", 1);
        student1.get_marks(85, 90);

        // Setting data for student 2
        student2.get_data("Aditya", 2);
        student2.get_marks(78, 88);

        // Displaying details for both students
        System.out.println("Details of Student 1:");
        student1.display();

        System.out.println("\nDetails of Student 2:");
        student2.display();
    }
}
