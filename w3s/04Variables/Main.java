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

        // Print Variables
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName; // Concatenate first and last names
        System.out.println(fullName); // Print the full name

        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the sum of x and y

        // Multiple Variables
        int a = 5, b = 6, c = 7; // Declare multiple variables in one line
        System.out.println(a + b + c); // Print the sum of a, b, and c

        int i, j, k; // Declare multiple variables without initialization
        i = j = k = 50; // Initialize all variables to 50
        System.out.println(i + j + k); // Print the sum of i, j, and k

        // Identifiers
        int minutesPerHour = 60; // Valid identifier
        int $dollarSign = 100; // Valid identifier with a dollar sign
        int _underscore = 200; // Valid identifier with an underscore
        // int 1stNumber = 10; // Invalid identifier, cannot start with a number
        // int my-variable = 30; // Invalid identifier, cannot contain a hyphen

        // Real-Life Examples
        //// Student data
        String studentName = "Alice";
        int studentID = 12345;
        int studentAge = 20;
        float studentFee = 1500.75f;
        char studentGrade = 'A';
        //// Print variables
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Student Fee: " + studentFee);
        System.out.println("Student Grade: " + studentGrade);

        // Calculate area of a rectangle
        int length = 10; // Length of the rectangle
        int width = 5; // Width of the rectangle
        int area;
        area = length * width; // Calculate the area
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area of the rectangle: " + area); // Print the area
    }
}
