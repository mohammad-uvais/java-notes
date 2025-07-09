public class WhileLoop {
    public static void main(String[] args) {
        // Use while loop to execute a block of code repeatedly, as long as a condition
        // is true
        // Use break to exit the loop
        // Use continue to skip the current iteration and continue with the next one

        int i = 0;
        while (i < 5) {
            System.out.println("i is: " + i);
            i++;
        }

        System.out.println("Loop finished");

        // Example with break
        int j = 0;
        while (j < 10) {
            if (j == 5) {
                System.out.println("Breaking the loop at j = " + j);
                break; // Exit the loop when j is 5
            }
            System.out.println("j is: " + j);
            j++;
        }
        System.out.println("Loop finished with break");

        // Example with continue
        int k = 0;
        while (k < 10) {
            k++;
            if (k == 5) {
                System.out.println("Skipping the iteration when k is " + k);
                continue; // Skip the rest of the loop when k is 5
            }
            System.out.println("k is: " + k);
        }
        System.out.println("Loop finished with continue");

        // Example with do-while loop
        int m = 0;
        do {
            System.out.println("m is: " + m);
            m++;
        } while (m < 5); // The loop will execute at least once, even if the condition is false initially
        System.out.println("Do-while loop finished");
    }
}
