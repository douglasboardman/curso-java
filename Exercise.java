import java.util.Scanner;

public class Exercise {
    public void simpleCalculator() {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        String continueCalculator;

        Boolean run = true;

        // Infinite loop to keep the calculator running until the user decides to quit
        mainLoop:
        while(run) {
            // Prompt the user to enter two numbers
            System.out.println("Enter the first number for the calculation");
            int firstNum = scanner.nextInt();

            System.out.println("Enter the second number for the calculation");
            int secondNum = scanner.nextInt();

            // Prompt the user to choose an operation
            // Perform the selected operation using a switch statement
            // Display the result if the operation was valid
            // Ask the user if they want to perform another calculation
            //TODO
        }
        
    
        // End the program
        System.out.println("Calculator session ended. Goodbye!");
    }
}
