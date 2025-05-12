//  Primitive Data Types and Wrapper Objects

class Asg7PDTaWO {
    public static void main(String[] args) {
        // a) Convert primitive data types into corresponding wrapper objects
        int primitiveInt = 10;
        char primitiveChar = 'A';
        float primitiveFloat = 5.5f;
        double primitiveDouble = 20.0;

        Integer wrapperInt = Integer.valueOf(primitiveInt);
        Character wrapperChar = Character.valueOf(primitiveChar);
        Float wrapperFloat = Float.valueOf(primitiveFloat);
        Double wrapperDouble = Double.valueOf(primitiveDouble);

        // b) Store null values in the int and float variables
        Integer nullInt = null;
        Float nullFloat = null;

        // c) Store the Wrapper Objects into primitive types
        int newPrimitiveInt = wrapperInt;
        char newPrimitiveChar = wrapperChar;
        float newPrimitiveFloat = wrapperFloat;
        double newPrimitiveDouble = wrapperDouble;

        System.out.println("Value of Integer Data after Primitive to Wrapper Conversion and Vise Versa: "+newPrimitiveInt);
        System.out.println("Value of Character Data after Primitive to Wrapper Conversion and Vise Versa: "+newPrimitiveChar);
        System.out.println("Value of Float Data after Primitive to Wrapper Conversion and Vise Versa: "+newPrimitiveFloat);
        System.out.println("Value of Double Data after Primitive to Wrapper Conversion and Vise Versa: "+newPrimitiveDouble);

        System.out.println();
        // d) Check characters in an array
        char[] characters = {'a', 'B', '1', ' ', 'c', 'D', '2'};
        for (char c : characters) {
            if (Character.isLowerCase(c)) {
                System.out.println(c + " is a lowercase character.");
            } else if (Character.isUpperCase(c)) {
                System.out.println(c + " is an uppercase character.");
            } else if (Character.isDigit(c)) {
                System.out.println(c + " is a digit.");
            } else if (Character.isWhitespace(c)) {
                System.out.println(c + " is a whitespace character.");
            }
        }
        
    }
}
