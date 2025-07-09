public class ForLoop {
    public static void main(String[] args) {
        // Use for loop to execute a block of code a specific number of times
        // Use break to exit the loop
        // Use continue to skip the current iteration and continue with the next one

        for (int i = 0; i < 5; i++) {
            System.out.println("i is: " + i);
        }
        System.out.println("Loop finished");

        // Example with break
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Breaking the loop at j = " + j);
                break; // Exit the loop when j is 5
            }
            System.out.println("j is: " + j);
        }
        System.out.println("Loop finished with break");

        // Example with continue
        for (int k = 0; k < 10; k++) {
            if (k == 5) {
                System.out.println("Skipping the iteration when k is " + k);
                continue; // Skip the rest of the loop when k is 5
            }
            System.out.println("k is: " + k);
        }
        System.out.println("Loop finished with continue");

        // Example with enhanced for loop (for-each loop)
        String[] fruits = { "Apple", "Banana", "Cherry" };
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        System.out.println("Enhanced for loop finished");

        // Example with nested for loop
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 2; b++) {
                System.out.println("a: " + a + ", b: " + b);
            }
        }
        System.out.println("Nested for loop finished");

        // Example with labeled for loop
        outerLoop: for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (y == 1) {
                    System.out.println("Breaking out of outer loop at x = " + x + ", y = " + y);
                    break outerLoop; // Breaks out of the outer loop
                }
                System.out.println("x: " + x + ", y: " + y);
            }
        }
        System.out.println("Labeled for loop finished");

        // Example with for loop with multiple variables
        for (int m = 0, n = 5; m < 5; m++, n--) {
            System.out.println("m: " + m + ", n: " + n);
        }
        System.out.println("For loop with multiple variables finished");

        // Example with for loop with array
        int[] numbers = { 1, 2, 3, 4, 5 };
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        System.out.println("For loop with array finished");

        // Example with for loop with string
        String text = "Hello";
        for (int index = 0; index < text.length(); index++) {
            System.out.println("Character at index " + index + ": " + text.charAt(index));
        }
        System.out.println("For loop with string finished");

        // Example with for loop with a condition
        for (int p = 0; p < 10 && p % 2 == 0; p++) {
            System.out.println("Even number: " + p);
        }
    }
}
