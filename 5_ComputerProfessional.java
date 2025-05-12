// Base class representing a computer professional
class ComputerProfessional {
    String EName;         // Employee Name
    int DutyHour;         // Duty Hours
    String Prospect;      // Employee's performance prospect

    // Constructor to initialize the employee details
    public ComputerProfessional(String EName, int DutyHour, String Prospect) {
        this.EName = EName;           // Initialize employee name
        this.DutyHour = DutyHour;     // Initialize duty hours
        this.Prospect = Prospect;      // Initialize prospect
    }

    // Method to display the employee details
    public void display() {
        System.out.println("Employee Name: " + EName);
        System.out.println("Duty Hour: " + DutyHour);
        System.out.println("Prospect: " + Prospect);
    }
}

// Class representing a Developer, inheriting from ComputerProfessional
class Developer extends ComputerProfessional {
    int StudyHour;  // Study hours for the developer

    // Constructor to initialize developer details
    public Developer(String EName, int DutyHour, String Prospect, int StudyHour) {
        super(EName, DutyHour, Prospect); // Call the parent constructor
        this.StudyHour = StudyHour;         // Initialize study hours
    }

    // Override display method to include study hours
    @Override
    public void display() {
        super.display();                    // Call the display method from ComputerProfessional
        System.out.println("Study Hour: " + StudyHour);
    }
}

// Class representing a Network Administrator, inheriting from ComputerProfessional
class NetworkAdmin extends ComputerProfessional {
    int PracticeHours; // Practice hours for network administration

    // Constructor to initialize network admin details
    public NetworkAdmin(String EName, int DutyHour, String Prospect, int PracticeHours) {
        super(EName, DutyHour, Prospect); // Call the parent constructor
        this.PracticeHours = PracticeHours; // Initialize practice hours
    }

    // Override display method to include practice hours
    @Override
    public void display() {
        super.display();                    // Call the display method from ComputerProfessional
        System.out.println("Practice Hours: " + PracticeHours);
    }
}

// Class representing a Data Operator, inheriting from ComputerProfessional
class DataOperator extends ComputerProfessional {
    int TypingSpeed; // Typing speed of the data operator

    // Constructor to initialize data operator details
    public DataOperator(String EName, int DutyHour, String Prospect, int TypingSpeed) {
        super(EName, DutyHour, Prospect); // Call the parent constructor
        this.TypingSpeed = TypingSpeed;    // Initialize typing speed
    }

    // Override display method to include typing speed
    @Override
    public void display() {
        super.display();                     // Call the display method from ComputerProfessional
        System.out.println("Typing Speed: " + TypingSpeed + " WPM");
    }
}

// Class representing a Java Professional, inheriting from Developer
class JavaProfessional extends Developer {
    String ProficiencyLevel; // Proficiency level in Java

    // Constructor to initialize Java professional details
    public JavaProfessional(String EName, int DutyHour, String Prospect, int StudyHour, String ProficiencyLevel) {
        super(EName, DutyHour, Prospect, StudyHour); // Call the parent constructor
        this.ProficiencyLevel = ProficiencyLevel;     // Initialize proficiency level
    }

    // Override display method to include proficiency level in Java
    @Override
    public void display() {
        super.display();                         // Call the display method from Developer
        System.out.println("Proficiency Level in Java: " + ProficiencyLevel);
    }
}

// Class representing a Python Professional, inheriting from Developer
class PythonProfessional extends Developer {
    String ProficiencyLevel; // Proficiency level in Python

    // Constructor to initialize Python professional details
    public PythonProfessional(String EName, int DutyHour, String Prospect, int StudyHour, String ProficiencyLevel) {
        super(EName, DutyHour, Prospect, StudyHour); // Call the parent constructor
        this.ProficiencyLevel = ProficiencyLevel;     // Initialize proficiency level
    }

    // Override display method to include proficiency level in Python
    @Override
    public void display() {
        super.display();                         // Call the display method from Developer
        System.out.println("Proficiency Level in Python: " + ProficiencyLevel);
    }
}

// Main class to test the functionality of computer professionals
class computerproffess {
    public static void main(String[] args) {
        // Creating a Developer object and displaying its details
        Developer dev = new Developer("Alice", 8, "Excellent", 5);
        dev.display(); // Show developer details
        System.out.println();

        // Creating a NetworkAdmin object and displaying its details
        NetworkAdmin netAdmin = new NetworkAdmin("Bob", 6, "Good", 4);
        netAdmin.display(); // Show network admin details
        System.out.println();

        // Creating a DataOperator object and displaying its details
        DataOperator dataOp = new DataOperator("Charlie", 7, "Fair", 70);
        dataOp.display(); // Show data operator details
        System.out.println();

        // Creating a JavaProfessional object and displaying its details
        JavaProfessional javaProf = new JavaProfessional("Dave", 8, "Excellent", 6, "Pro");
        javaProf.display(); // Show Java professional details
        System.out.println();

        // Creating a PythonProfessional object and displaying its details
        PythonProfessional pythonProf = new PythonProfessional("Eve", 7, "Good", 4, "Intermediate");
        pythonProf.display(); // Show Python professional details
    }
}
