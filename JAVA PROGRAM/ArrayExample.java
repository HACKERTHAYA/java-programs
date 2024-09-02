public class ArrayExample {
    public static void main(String[] args) {
        // Declaration and initialization
        int[] numbers = new int[5]; // Array of 5 integers, default values are 0
        numbers[0] = 10;
        numbers[1] = 20;

        // Declaration and initialization with values
        int[] moreNumbers = {1, 2, 3, 4, 5}; // Array of 5 integers

        // Accessing elements
        System.out.println("First element: " + moreNumbers[0]); // Outputs 1

        // Iterating over an array
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.println("Element at index " + i + ": " + moreNumbers[i]);
        }
    }
}
