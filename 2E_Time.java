// Define the Time class to represent a specific time with hours, minutes, and seconds
class Time {
    // Member variables to store hours, minutes, and seconds
    private int hr;   // Hours component
    private int min;  // Minutes component
    private double sec; // Seconds component

    // Constructor to initialize the Time object with specified hours, minutes, and seconds
    public Time(int hr, int min, double sec) {
        this.hr = hr;     // Set the hours
        this.min = min;   // Set the minutes
        this.sec = sec;   // Set the seconds
        normalizeTime();  // Normalize the time to ensure valid values
    }

    // Method to display the current time
    public void showTime() {
        // Print the current time in hr:min:sec format
        System.out.println("Time: " + hr + " hr " + min + " min " + sec + " sec");
    }

    // Method to add minutes to the current time
    public void add_time(int minutes) {
        this.min += minutes; // Add the specified minutes to the current minutes
        normalizeTime();     // Normalize the time to ensure valid values
    }

    // Method to add hours and minutes to the current time
    public void add_time(int hours, int minutes) {
        this.hr += hours;     // Add the specified hours to the current hours
        this.min += minutes;  // Add the specified minutes to the current minutes
        normalizeTime();      // Normalize the time to ensure valid values
    }

    // Method to add seconds to the current time
    public void add_time(double seconds) {
        this.sec += seconds;  // Add the specified seconds to the current seconds
        normalizeTime();      // Normalize the time to ensure valid values
    }

    // Method to add another Time object to the current time
    public void add_time(Time t) {
        this.hr += t.hr;   // Add the hours from the provided Time object
        this.min += t.min; // Add the minutes from the provided Time object
        this.sec += t.sec; // Add the seconds from the provided Time object
        normalizeTime();    // Normalize the time to ensure valid values
    }

    // Private method to normalize the time values
    private void normalizeTime() {
        // Check if seconds are 60 or more
        if (this.sec >= 60.0) {
            this.min += (int) (this.sec / 60); // Convert excess seconds to minutes
            this.sec = this.sec % 60;          // Remainder becomes the new seconds
        }
        // Check if minutes are 60 or more
        if (this.min >= 60) {
            this.hr += this.min / 60; // Convert excess minutes to hours
            this.min = this.min % 60;  // Remainder becomes the new minutes
        }
    }

    // Main method to test the Time class functionality
    public static void main(String[] args) {
        // Create two Time objects with initial values
        Time t1 = new Time(18, 58, 39.0); // First Time object
        Time t2 = new Time(20, 50, 21);   // Second Time object

        // Display initial values of t1
        System.out.println("Initial Time t1:");
        t1.showTime();

        // Display initial values of t2
        System.out.println("Initial Time t2:");
        t2.showTime();

        // Perform addition of 24 minutes to t1
        t1.add_time(24);
        System.out.println("After adding 24 minutes to t1:");
        t1.showTime(); // Display the updated values of t1

        // Perform addition of 23 hours and 5 minutes to t1
        t1.add_time(23, 05);
        System.out.println("After adding 23 hour and 05 minutes to t1:");
        t1.showTime(); // Display the updated values of t1

        // Perform addition of 30.50 seconds to t1
        t1.add_time(30.50);
        System.out.println("After adding 30.50 seconds to t1:");
        t1.showTime(); // Display the updated values of t1

        // Add t2 to t1 and store the result in t1
        t1.add_time(t2);
        System.out.println("After adding t2 to t1:");
        t1.showTime(); // Display the updated values of t1
    }
}
