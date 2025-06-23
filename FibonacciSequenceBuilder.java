import java.util.Scanner;

public class FibonacciSequenceBuilder {
    public static void main(String[] args) {
        // Instantiate the scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Print welcome statement
        System.out.println("Welcome to the fibonacci builder!");
        System.out.println();

        // Start loop to get validated value to sequence length
        Boolean validLen = false;
        int sequenceLength = 0;

        while (validLen != true) {
            // Get user input to build fibonacci sequence
            System.out.println("Enter the number of the fibonacci sequence length");
            sequenceLength = scanner.nextInt();
            if (sequenceLength > 0) {
                validLen = true;
                break;
            } else {
                System.out.println();
                System.out.println("Value not valid. Please insert a integer value.");
                System.out.println();
            }
        }

        // Build Fibonacci sequence

        // Initialize the sequence array
        int[] sequence = new int[sequenceLength];
        sequence[0] = 0;

        for (int i = 1; i < sequenceLength; i++) {
            if (i == 1) {
                sequence[i] = 1;
            } else {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
        }

        // Print sequence result
        String sequenceStr = "";
        System.out.println();

        for (int j = 0; j < sequenceLength; j++) {
            sequenceStr = j < (sequenceLength - 1) ? sequenceStr + String.valueOf(sequence[j]) + ", " : sequenceStr + String.valueOf(sequence[j]);
        }
        System.out.println("Your sequence is:");
        System.out.println(sequenceStr);

        scanner.close();

    }
}
