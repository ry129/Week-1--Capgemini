public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null; // Initialize the variable to null
        System.out.println("Attempting to call a method on a null object...");
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null; // Initialize the variable to null

        try {
            System.out.println("Attempting to call a method on a null object...");
            System.out.println(text.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
            System.out.println("The object 'text' is null and cannot be accessed.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Calling method to generate NullPointerException...");
        try {
            generateException(); // This will throw and stop the program
        } catch (NullPointerException e) {
            System.out.println("Exception handled in main: " + e.getMessage());
        }

        System.out.println("\nRefactoring to call method with exception handling...");
        handleException(); // This method handles the exception internally
    }
}
