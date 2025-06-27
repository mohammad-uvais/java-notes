public class Main {
    public static void main(String[] args) {
        // Primary Data Types
        // Number Types
        // Integer Types
        byte byteValue = 100; // 8-bit signed integer
        short shortValue = 10000; // 16-bit signed integer
        int intValue = 100000; // 32-bit signed integer
        long longValue = 100000L; // 64-bit signed integer
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Ling: " + longValue);
        // Floating Point Types
        // Note: float is less precise than double
        // and should be used when memory savings are more important than precision.
        // Use double for most floating-point calculations.
        float floatValue = 10.5f; // 32-bit floating point
        double doubleValue = 20.99; // 64-bit floating point
        System.out.println("Float: " + floatValue);
        System.out.println("double: " + doubleValue);
        float f1 = 35e3f; // 35,000.0 in scientific notation
        double d1 = 12E4d; // 120,000.0 in scientific
        System.out.println("Float in scientific notation: " + f1);
        System.out.println("Double in scientific notation: " + d1);
        // Character Types
        char charValue = 'A'; // 16-bit Unicode character
        System.out.println("Char: " + charValue);
        char myVar1 = 65, myVar2 = 66, myVar3 = 67; // Unicode values for 'A', 'B', 'C'
        System.out.println("Char from Unicode values: " + myVar1 + ", " + myVar2 + ", " + myVar3);
        String greeting = "Hello, World!"; // String is a sequence of characters
        System.out.println("String: " + greeting);
        // Boolean Types
        boolean booleanValue = true; // true or false
        System.out.println("Boolean: " + booleanValue);
    }
}