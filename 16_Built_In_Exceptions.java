class BuiltInExceptions {
    public static void main(String[] args) {
        // 1. Demonstrate ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b;  // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        // 2. Demonstrate ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5];  // This will cause ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }

        // 3. Demonstrate NullPointerException
        try {
            String str = null;
            int length = str.length();  // This will cause NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

        // 4. Demonstrate NumberFormatException
        try {
            String number = "abc";
            int num = Integer.parseInt(number);  // This will cause NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
