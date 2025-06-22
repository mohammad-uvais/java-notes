public class Main {
    public static void main(String[] args) {
        String name = "John"; // Declare a variable named 'name' and assign it the value "John"
        System.out.println("Hello, " + name + "!"); // Print a greeting message using the variable 'name'

        int myNum = 15;
        myNum = 20;
        System.out.println(myNum); // Print the value of the variable 'myNum'

        final int myFinalNum = 25; // Declare a constant variable named 'myFinalNum'
        System.out.println(myFinalNum); // Print the value of the constant variable 'myFinalNum'

        // The following line would cause an error if uncommented, as myFinalNum is a
        // constant
        // myFinalNum = 20; // Uncommenting this line would result in a compilation
        // error

        // Other variable types
        int myIntNum = 5;
        float myFloatNum = 5.99f; // Declare a float variable
        char myLetter = 'D'; // Declare a character variable
        boolean myBool = true; // Declare a boolean variable
        String myText = "Hello"; // Declare a string variable
    }
}
