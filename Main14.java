import mypackage14.PublicClass;
public class Main14 {
    public static void main(String[] args) {
        // Create an object of the public class
        PublicClass publicObj = new PublicClass();
        publicObj.displayMessage(); // This should work successfully.

        // Attempt to create an object of the package-private class
        // The following line will cause a compile-time error if uncommented:
        // PackagePrivateClass privateObj = new PackagePrivateClass();
        // privateObj.displayMessage();

        System.out.println("Attempting to access a package-private class from outside the package will result in a compile-time error.");
    }
}
