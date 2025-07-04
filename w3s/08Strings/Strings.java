
public class Strings {
    public static void main(String[] args) {
        // Strings in Java are a sequence of characters.
        // Strings are objects that represent a sequence of characters.
        // Strings are immutable, meaning once created, they cannot be changed.

        // Creating a string
        String greeting = "Hello, World!";
        System.out.println(greeting); // Outputs: Hello, World!

        // String length
        int length = greeting.length();
        System.out.println("Length of the string: " + length); // Outputs: 13

        // Accessing characters in a string
        char firstChar = greeting.charAt(0);
        System.out.println("First character: " + firstChar); // Outputs: H

        // Concatenating strings
        String name = "Alice";
        String welcomeMessage = greeting + " Welcome, " + name + "!";
        System.out.println(welcomeMessage); // Outputs: Hello, World! Welcome, Alice!
        // You can also use the concat() method to concatenate two strings
        String anotherMessage = greeting.concat(" How are you?");
        System.out.println(anotherMessage); // Outputs: Hello, World! How are you?

        // Converting to uppercase and lowercase
        String upperCaseGreeting = greeting.toUpperCase();
        String lowerCaseGreeting = greeting.toLowerCase();
        System.out.println("Uppercase: " + upperCaseGreeting); // Outputs: HELLO, WORLD!
        System.out.println("Lowercase: " + lowerCaseGreeting); // Outputs: hello, world!

        // Finding a substring
        int indexOfWorld = greeting.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld); // Outputs: 7

        // Replacing characters in a string
        String replacedGreeting = greeting.replace("World", "Java");
        System.out.println(replacedGreeting); // Outputs: Hello, Java!

        // Splitting a string
        String[] words = greeting.split(", ");
        for (String word : words) {
            System.out.println(word); // Outputs each word on a new line
        }

        // Special characters in strings
        String specialChars = "This is a backslash: \\, and this is a double quote: \"";
        System.out.println(specialChars); // Outputs: This is a backslash: \, and this is a double quote: "
    }
}
