public class StringExample {
    public static void main(String[] args) {
        // Creating strings
        String greeting = "Hello, World!";
        String name = "Alice";

        // String concatenation
        String message = greeting + " My name is " + name;
        System.out.println(message); // Outputs: Hello, World! My name is Alice

        // String length
        int length = greeting.length();
        System.out.println("Length: " + length); // Outputs: Length: 13

        // Substring
        String sub = greeting.substring(7, 12);
        System.out.println("Substring: " + sub); // Outputs: World

        // Convert to uppercase
        String upper = greeting.toUpperCase();
        System.out.println("Uppercase: " + upper); // Outputs: HELLO, WORLD!

        // Trim whitespace
        String padded = "   text   ";
        String trimmed = padded.trim();
        System.out.println("Trimmed: '" + trimmed + "'"); // Outputs: 'text'

        // Splitting strings
        String[] words = greeting.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
