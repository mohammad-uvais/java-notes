public class MathClass {
    public static void main(String[] args) {
        // Math in Java
        // The Math class provides methods for performing basic numeric operations such
        // as
        // exponentiation, logarithms, square roots, and trigonometric functions.

        // Finding the maximum and minimum of two numbers
        int a = 10;
        int b = 20;
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println("Max: " + max); // Outputs: 20
        System.out.println("Min: " + min); // Outputs: 10

        // Finding the absolute value of a number
        int negativeNumber = -15;
        int absoluteValue = Math.abs(negativeNumber);
        System.out.println("Absolute Value: " + absoluteValue); // Outputs: 15

        // Finding the square root of a number
        double number = 25.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square Root: " + squareRoot); // Outputs: 5.0

        // Finding the power of a number
        double base = 2.0;
        double exponent = 3.0;
        double power = Math.pow(base, exponent);
        System.out.println("Power: " + power); // Outputs: 8.0

        // Rounding a number to the nearest integer
        double decimalNumber = 7.5;
        long roundedValue = Math.round(decimalNumber);
        System.out.println("Rounded Value: " + roundedValue); // Outputs: 8

        // Generating a random number between 0 (inclusive) and 1 (exclusive)
        double randomValue = Math.random();
        System.out.println("Random Value: " + randomValue); // Outputs a random value between 0 and 1
        // if you want a random number between 0 and 100, you can use the formula:
        int randomInt = (int) (Math.random() * 101);
        System.out.println("Random Integer between 0 and 100: " + randomInt);
    }
}
