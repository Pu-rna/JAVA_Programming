// Base class representing a general bank account
class Account {
    String accNo;      // Account number
    String cName;      // Customer name
    String contactNo;  // Customer contact number

    // Constructor to initialize account details
    public Account(String accNo, String cName, String contactNo) {
        this.accNo = accNo;           // Initialize account number
        this.cName = cName;           // Initialize customer name
        this.contactNo = contactNo;   // Initialize contact number
    }

    // Method to display account details
    public void show() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Customer Name: " + cName);
        System.out.println("Contact Number: " + contactNo);
    }
}

// Class representing a savings account, inheriting from Account
class Savings_Ac extends Account {
    double ROI;            // Rate of Interest
    double accBalance;     // Account balance

    // Constructor to initialize savings account details
    public Savings_Ac(String accNo, String cName, String contactNo, double roi, double accBalance) {
        super(accNo, cName, contactNo); // Call the parent constructor
        this.ROI = roi;                   // Initialize rate of interest
        this.accBalance = accBalance;     // Initialize account balance
    }

    // Method to display savings account data
    public void showData() {
        show(); // Call the show method from Account class
        System.out.println("Rate of Interest: " + ROI);
        System.out.println("Account Balance: " + accBalance);
    }

    // Method to compute interest earned
    public double compute() {
        double interest = (accBalance * ROI) / 100; // Calculate interest
        return interest; // Return computed interest
    }
}

// Class representing a current account, inheriting from Account
class Current_Ac extends Account {
    double accBalance;  // Account balance
    double minBalance;  // Minimum balance requirement

    // Constructor to initialize current account details
    public Current_Ac(String accNo, String cName, String contactNo, double accBalance, double minBalance) {
        super(accNo, cName, contactNo); // Call the parent constructor
        this.accBalance = accBalance;     // Initialize account balance
        this.minBalance = minBalance;     // Initialize minimum balance
    }

    // Method to display current account data
    public void showData() {
        show(); // Call the show method from Account class
        System.out.println("Account Balance: " + accBalance);
        System.out.println("Minimum Balance: " + minBalance);
    }

    // Method to check account status based on balance
    public String compute() {
        if (accBalance < minBalance) {
            return "Account below minimum balance!"; // Account below minimum balance
        }
        return "Account is in good standing."; // Account is fine
    }
}

// Class representing a fixed deposit account, inheriting from Account
class TD_Ac extends Account {
    double principal;        // Principal amount
    int term;               // Term in years
    double ROI;             // Rate of Interest
    double maturityBalance;  // Maturity balance after the term

    // Constructor to initialize fixed deposit account details
    public TD_Ac(String accNo, String cName, String contactNo, double principal, int term, double roi) {
        super(accNo, cName, contactNo); // Call the parent constructor
        this.principal = principal;       // Initialize principal
        this.term = term;                 // Initialize term
        this.ROI = roi;                   // Initialize rate of interest
        this.maturityBalance = computeMaturityBalance(); // Compute maturity balance
    }

    // Method to display fixed deposit account data
    public void showData() {
        show(); // Call the show method from Account class
        System.out.println("Principal: " + principal);
        System.out.println("Term: " + term + " years");
        System.out.println("Rate of Interest: " + ROI);
        System.out.println("Maturity Balance: " + maturityBalance);
    }

    // Method to compute maturity balance
    public double computeMaturityBalance() {
        return principal * (1 + (ROI / 100) * term); // Calculate maturity balance
    }
}

// Main class to test the functionality of accounts
class Acc {
    public static void main(String[] args) {
        // Creating a Savings_Ac object and displaying its details
        Savings_Ac savingsAccount = new Savings_Ac("001", "Aditya", "1234567890", 3.5, 1000);
        savingsAccount.showData(); // Show savings account data
        System.out.println("Interest Earned: " + savingsAccount.compute()); // Display interest earned

        // Creating a Current_Ac object and displaying its details
        Current_Ac currentAccount = new Current_Ac("002", "Ayush", "0987654321", 500, 100);
        currentAccount.showData(); // Show current account data
        System.out.println(currentAccount.compute()); // Display account status

        // Creating a TD_Ac object and displaying its details
        TD_Ac tdAccount = new TD_Ac("003", "Ranjana", "5555555555", 10000, 5, 5);
        tdAccount.showData(); // Show fixed deposit account data
    }
}
