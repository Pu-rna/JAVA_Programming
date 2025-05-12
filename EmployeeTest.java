// Base class Employee
abstract class Employee {
    protected String ECode;
    protected String Ename;
    protected String ContactNo;
    protected double BasicSal;
    protected double GrossSal;
    protected String Dept;

    // Constructor
    public Employee(String ECode, String Ename, String ContactNo, double BasicSal, String Dept) {
        this.ECode = ECode;
        this.Ename = Ename;
        this.ContactNo = ContactNo;
        this.BasicSal = BasicSal;
        this.Dept = Dept;
        computeTotSalary();  // Compute Gross Salary upon initialization
    }

    // Method to compute Gross Salary
    public void computeTotSalary() {
        double DA = 0.75 * BasicSal;     // 75% of Basic Salary
        double HRA = 0.15 * BasicSal;    // 15% of Basic Salary
        double MA = 0.10 * BasicSal;     // 10% of Basic Salary
        GrossSal = BasicSal + DA + HRA + MA;
    }

    // Abstract method for calculating bonus
    public abstract double calcBonus();

    // Method to display employee data
    public void showData() {
        System.out.println("Employee Code: " + ECode);
        System.out.println("Employee Name: " + Ename);
        System.out.println("Contact No: " + ContactNo);
        System.out.println("Department: " + Dept);
        System.out.println("Basic Salary: " + BasicSal);
        System.out.println("Gross Salary: " + GrossSal);
    }
}

// Subclass Manager
class Manager extends Employee {

    // Constructor
    public Manager(String ECode, String Ename, String ContactNo, double BasicSal, String Dept) {
        super(ECode, Ename, ContactNo, BasicSal, Dept);
    }

    // Calculate bonus for Manager
    @Override
    public double calcBonus() {
        double bonus = 0.20 * BasicSal; // 20% of Basic Salary as Bonus
        System.out.println("Bonus for Manager: " + bonus);
        return bonus;
    }
}

// Subclass Engineer
class Engineer extends Employee {

    // Constructor
    public Engineer(String ECode, String Ename, String ContactNo, double BasicSal, String Dept) {
        super(ECode, Ename, ContactNo, BasicSal, Dept);
    }

    // Calculate bonus for Engineer
    @Override
    public double calcBonus() {
        double bonus = 0.15 * BasicSal; // 15% of Basic Salary as Bonus
        System.out.println("Bonus for Engineer: " + bonus);
        return bonus;
    }
}

// Subclass Clerk
class Clerk extends Employee {

    // Constructor
    public Clerk(String ECode, String Ename, String ContactNo, double BasicSal, String Dept) {
        super(ECode, Ename, ContactNo, BasicSal, Dept);
    }

    // Calculate bonus for Clerk
    @Override
    public double calcBonus() {
        double bonus = 0.10 * BasicSal; // 10% of Basic Salary as Bonus
        System.out.println("Bonus for Clerk: " + bonus);
        return bonus;
    }
}

// Main Class to test the implementation
public class EmployeeTest {
    public static void main(String[] args) {
        // Create Manager object
        Manager manager = new Manager("M101", "Alice", "1234567890", 50000, "Management");
        System.out.println("Manager Details:");
        manager.showData();
        manager.calcBonus();
        System.out.println("-----------------------------------");

        // Create Engineer object
        Engineer engineer = new Engineer("E202", "Bob", "9876543210", 40000, "Engineering");
        System.out.println("Engineer Details:");
        engineer.showData();
        engineer.calcBonus();
        System.out.println("-----------------------------------");

        // Create Clerk object
        Clerk clerk = new Clerk("C303", "Charlie", "1122334455", 30000, "Administration");
        System.out.println("Clerk Details:");
        clerk.showData();
        clerk.calcBonus();
        System.out.println("-----------------------------------");
    }
}
