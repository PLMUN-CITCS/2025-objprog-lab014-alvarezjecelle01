public class MethodReturnTypes {

    public static void main(String[] args) {
        // Call the displayWelcomeMessage method
        displayWelcomeMessage();
        
        // Declare variables
        int value1 = 20;
        int value2 = 30;
        
        // Call the calculateAverage method and store the result
        double result = calculateAverage(value1, value2);
        
        // Print the calculated average
        System.out.println("The average is: " + result);
    }

    // This method displays a welcome message. It doesn't return any value (void method)
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // This method calculates the average of two integers and returns a double value
    public static double calculateAverage(int num1, int num2) {
        // Calculate the average
        double average = (num1 + num2) / 2.0;
        
        // Return the average value
        return average;
    }
}
