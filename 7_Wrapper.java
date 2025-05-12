// Class to demonstrate the use of wrapper classes in Java
class WrapperExample {

    public static void main(String[] args) {
        // Part a: Primitive to Wrapper Object
        // Creating wrapper objects from primitive types
        Integer intObj = Integer.valueOf(10);  // Convert int to Integer
        Character charObj = Character.valueOf('a');  // Convert char to Character
        Float floatObj = Float.valueOf(10.5f);  // Convert float to Float
        Double doubleObj = Double.valueOf(20.5);  // Convert double to Double
        
        // Displaying the created wrapper objects
        System.out.println("Wrapper Objects:");
        System.out.println("Integer: " + intObj); // Print Integer object
        System.out.println("Character: " + charObj); // Print Character object
        System.out.println("Float: " + floatObj); // Print Float object
        System.out.println("Double: " + doubleObj); // Print Double object
        
        // Part b: Assign null to int and float wrapper objects
        // Demonstrating that wrapper types can hold null
        Integer nullInt = null; // Integer object assigned null
        Float nullFloat = null; // Float object assigned null
        
        // Displaying null values
        System.out.println("\nNull Values:");
        System.out.println("Null Integer: " + nullInt); // Print null Integer object
        System.out.println("Null Float: " + nullFloat); // Print null Float object

        // Part c: Wrapper to Primitive types
        // Unboxing: Converting wrapper objects back to primitive types
        int intValue = intObj.intValue();  // Convert Integer to int
        char charValue = charObj.charValue();  // Convert Character to char
        float floatValue = floatObj.floatValue();  // Convert Float to float
        double doubleValue = doubleObj.doubleValue();  // Convert Double to double
        
        // Displaying primitive values obtained from wrapper objects
        System.out.println("\nPrimitive Values:");
        System.out.println("int: " + intValue); // Print primitive int value
        System.out.println("char: " + charValue); // Print primitive char value
        System.out.println("float: " + floatValue); // Print primitive float value
        System.out.println("double: " + doubleValue); // Print primitive double value
        
        // Part d: Check characters
        // Array of characters to demonstrate character checks
        char[] chars = {'A', 'a', '1', ' '};
        // Loop through each character in the array
        for (char ch : chars) {
            // Check if the character is a lowercase letter
            if (Character.isLowerCase(ch)) {
                System.out.println(ch + " is a lowercase letter.");
            // Check if the character is an uppercase letter
            } else if (Character.isUpperCase(ch)) {
                System.out.println(ch + " is an uppercase letter.");
            // Check if the character is a digit
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a digit.");
            // Check if the character is a whitespace
            } else if (Character.isWhitespace(ch)) {
                System.out.println(ch + " is a whitespace.");
            }
        }
    }
}
