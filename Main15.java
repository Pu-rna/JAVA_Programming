import shapes15.Circle;     // Importing Circle class from shapes package
import shapes15.Rectangle;  // Importing Rectangle class from shapes package

class Main15 {
    public static void main(String[] args) {
        // Creating an object of Circle and displaying its details
        Circle circle = new Circle(5.0);
        circle.display();

        // Creating an object of Rectangle and displaying its details
        Rectangle rectangle = new Rectangle(4.0, 7.0);
        rectangle.display();
    }
}
