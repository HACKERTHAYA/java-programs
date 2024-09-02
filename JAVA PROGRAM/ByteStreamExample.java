public class  {
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Write data to file
        try (FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            String data = "Hello, this is a test.";
            fos.write(data.getBytes()); // Convert string to bytes and write
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data from file
        try (FileInputStream fis = new FileInputStream(inputFilePath)) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Convert byte to character and print
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
