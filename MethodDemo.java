public class MethodDemo {

    public static void main(String[] args) {
        greet(); // Calling the greet method
        printMessage("This is my message!"); // Calling the printMessage method with a parameter
    }

    // The greet method prints a greeting message
    public static void greet() {
        System.out.println("Hello from the greet method!"); 
    }

    // The printMessage method prints the message passed as an argument
    public static void printMessage(String message) {
        System.out.println(message); 
    }
}
