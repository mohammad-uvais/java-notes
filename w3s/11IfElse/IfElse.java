public class IfElse {
    public static void main(String[] args) {
        // Use if to specify a block code to be executed, if a specified condition is
        // true
        // Use else to specify a block of code to be executed, if the same condition is
        // false
        // Use else if to specify a new condition to test, if the first condition is
        // false

        int number = 10;
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Example with a boolean condition\
        boolean isRaining = true;
        if (isRaining) {
            System.out.println("It's raining, take an umbrella.");
        } else {
            System.out.println("It's not raining, no umbrella needed.");
        }

        // Example with a string condition
        String day = "Monday";
        if (day.equals("Monday")) {
            System.out.println("It's the start of the week.");
        } else if (day.equals("Friday")) {
            System.out.println("It's almost the weekend.");
        } else {
            System.out.println("It's just another day.");
        }

        // Example with a nested if statement
        int age = 20;
        if (age >= 18) {
            System.out.println("You are an adult.");
            if (age >= 65) {
                System.out.println("You are a senior citizen.");
            } else {
                System.out.println("You are not a senior citizen.");
            }
        } else {
            System.out.println("You are a minor.");
        }
    }
}
