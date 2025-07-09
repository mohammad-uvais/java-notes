public class Arrays {
    public static void main(String[] args) {
        // Use arrays to store multiple values in a single variable
        // Use array index to access individual elements
        // Use array length to get the number of elements in the array

        // Declare and initialize an array
        String[] fruits = { "Apple", "Banana", "Cherry" };

        // Access elements using index
        System.out.println("First fruit: " + fruits[0]);
        System.out.println("Second fruit: " + fruits[1]);
        System.out.println("Third fruit: " + fruits[2]);

        // Get the length of the array
        System.out.println("Number of fruits: " + fruits.length);

        // Loop through the array using a for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit at index " + i + ": " + fruits[i]);
        }

        // Loop through the array using an enhanced for loop (for-each loop)
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Example of a multidimensional array
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        // Access elements in a multidimensional array
        System.out.println("Element at (0, 0): " + matrix[0][0]);
        System.out.println("Element at (1, 2): " + matrix[1][2]);
        System.out.println("Element at (2, 1): " + matrix[2][1]);
        // Loop through a multidimensional array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at (" + i + ", " + j + "): " + matrix[i][j]);
            }
        }
    }
}
