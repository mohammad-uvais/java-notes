public class Booleans {

    public static void main(String[] args) {
        // Declare a boolean variable
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // Print the boolean values
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);

        // Use boolean in an if statement
        if (isJavaFun) {
            System.out.println("Java is indeed fun!");
        } else {
            System.out.println("Java is not fun.");
        }

        // Use boolean in a comparison
        int x = 10;
        int y = 20;
        boolean isXGreaterThanY = x > y;
        System.out.println("Is x greater than y? " + isXGreaterThanY);
    }
}