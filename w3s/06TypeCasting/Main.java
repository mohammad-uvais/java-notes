
public class Main {
    public static void main(String[] args) {
        // Type Casting in Java
        // Type casting is the process of converting a variable from one type to
        // another.
        // Type casting is when you assign a value of one primitive data type to another
        // primitive data type.

        // There are two types of type casting in Java:

        // 1. Implicit Casting (Widening Conversion)
        // Widening Casting (automatically done) - converting a smaller type to a larger
        // type size.
        // byte -> short -> char -> int -> long -> float -> double
        int myInt = 100;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt); // Outputs 100
        System.out.println(myDouble); // Outputs 100.0

        // 2. Explicit Casting (Narrowing Conversion)
        // Narrowing Casting (manually done) - converting a larger type to a smaller
        // size
        // double -> float -> long -> int -> char -> short -> byte
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2); // Outputs 9.78
        System.out.println(myInt2); // Outputs 9

        // Real-Life Example
        // Set the maximum possible score in the game to 500
        int maxScore = 500;
        // The actual score of the user
        int userScore = 423;
        /*
         * Calculate the percentage of the user's score in relation to the maximum
         * available score.
         * Convert userScore to float to make sure that the division is accurate
         */
        float percentage = (float) userScore / maxScore * 100;
        System.out.println("User's percentage score: " + percentage + "%");
    }
}
