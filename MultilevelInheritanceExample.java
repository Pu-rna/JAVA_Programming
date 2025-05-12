// Base class6.1
class Base {
    public void display() {
        System.out.println("Display method in Base class");
    }
}

// Intermediate class (extends Base)
class Intermediate extends Base {
    // Override display() method
    @Override
    public final void display() {
        System.out.println("Display method in Intermediate class");
    }
}

// Derived class (extends Intermediate)
class Derived extends Intermediate {
    // Attempting to override display() would cause a compilation error
    /*
    @Override
    public void display() {
        System.out.println("Display method in Derived class");
    }
    */
    
    public void show() {
        System.out.println("Show method in Derived class");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Base baseObj = new Base();
        baseObj.display(); // Calls Base class display()

        Intermediate interObj = new Intermediate();
        interObj.display(); // Calls Intermediate class display()

        Derived derivedObj = new Derived();
        derivedObj.display(); // Calls Intermediate class display() because it can't be overridden in Derived
        derivedObj.show();    // Calls Derived class show()
    }
}

